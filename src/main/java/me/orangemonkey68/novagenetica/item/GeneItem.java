package me.orangemonkey68.novagenetica.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GeneItem extends Item {
    public GeneItem(Settings settings) {
        super(settings);
    }

    @Override
    public String getTranslationKey(ItemStack stack) {
        CompoundTag tag = stack.getTag();
        if(tag != null){
            Identifier id = new Identifier(tag.getString("entityType"));
            if(Registry.ENTITY_TYPE.containsId(id)){
                return "item.gene." + id.toString();
            }
        }

        return "item.gene.unknown";
    }
}
