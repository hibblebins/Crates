package opileos.additions.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent DIAMOND_DUST = new FoodComponent.Builder().alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 360),.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 6000, 9),.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE,1,0),1f).build();
    public static final FoodComponent SHARD_BOWL = new FoodComponent.Builder().alwaysEdible()
            .build();
    public static final FoodComponent CAVE_CARROT = new FoodComponent.Builder().alwaysEdible().hunger(2).saturationModifier(3)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 600), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 100, 2), .5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200), .1f).build();
}
