package endreborn.mod.enchants;


import endreborn.Reference;
import endreborn.mod.entity.EntityAngryEnder;
import endreborn.mod.entity.EntityChronologist;
import endreborn.mod.entity.EntityWatcher;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.MultiPartEntityPart;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.potion.PotionEffect;

public class EnchantSCore extends Enchantment {

    public EnchantSCore() {
        super(Rarity.RARE, EnumEnchantmentType.WEAPON, new EntityEquipmentSlot[] { EntityEquipmentSlot.MAINHAND });
        setRegistryName(Reference.MODID, "shulker_core");
        setName("shulker_core");
    }


    public void onEntityDamaged(EntityLivingBase user, Entity target, int level) {
        if(target instanceof EntityLivingBase) {
            ((EntityLivingBase) target).addPotionEffect(new PotionEffect(MobEffects.LEVITATION, 50, level + 2));
        }
    }
    @Override
    public int getMaxLevel()
    {
        return 3;
    }
}
