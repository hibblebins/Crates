package opileos.crates.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent DIAMOND_DUST = new FoodComponent.Builder().alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 360),.5f).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 6000, 10),.3f).build();
}
