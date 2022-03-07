
package net.mcreator.the_legende_of_luma.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Checkbox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.the_legende_of_luma.world.inventory.LumaWandUiMenu;
import net.mcreator.the_legende_of_luma.network.LumaWandUiButtonMessage;
import net.mcreator.the_legende_of_luma.TheLegendeOfLumaMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class LumaWandUiScreen extends AbstractContainerScreen<LumaWandUiMenu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Checkbox Invisible;
	Checkbox NoGravity;
	EditBox TageName;

	public LumaWandUiScreen(LumaWandUiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 240;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("the_legende_of_luma:textures/luma_wand_ui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		TageName.render(ms, mouseX, mouseY, partialTicks);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (TageName.isFocused())
			return TageName.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		TageName.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Entity :", 45, 10, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 92, this.topPos + 133, 50, 20, new TextComponent("Enter"), e -> {
			if (true) {
				TheLegendeOfLumaMod.PACKET_HANDLER.sendToServer(new LumaWandUiButtonMessage(0, x, y, z));
				LumaWandUiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		Invisible = new Checkbox(this.leftPos + 149, this.topPos + 44, 150, 20, new TextComponent("Invisible"), false);
		LumaWandUiMenu.guistate.put("checkbox:Invisible", Invisible);
		this.addRenderableWidget(Invisible);
		NoGravity = new Checkbox(this.leftPos + 38, this.topPos + 43, 150, 20, new TextComponent("NoGravity"), false);
		LumaWandUiMenu.guistate.put("checkbox:NoGravity", NoGravity);
		this.addRenderableWidget(NoGravity);
		TageName = new EditBox(this.font, this.leftPos + 56, this.topPos + 97, 120, 20, new TextComponent("TageName")) {
			{
				setSuggestion("TageName");
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion("TageName");
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion("TageName");
				else
					setSuggestion(null);
			}
		};
		LumaWandUiMenu.guistate.put("text:TageName", TageName);
		TageName.setMaxLength(32767);
		this.addWidget(this.TageName);
	}
}
