package com.sammy.lodestone.mixin;

import net.minecraft.client.render.item.ItemRenderer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ItemRenderer.class)
final class ItemRendererMixin {

//	@Inject(at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/BufferBuilderStorage;getEntityVertexConsumers()Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;"), method = "re")
//	private void lodestone$itemParticleEmitter(ItemStack stack, int x, int y, BakedModel model, CallbackInfo ci) {
//		ScreenParticleHandler.renderItem(stack);
//	}
}
