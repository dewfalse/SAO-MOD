package SAO.mods.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import SAO.mods.SAOMOD;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSAOSkill extends Item
{
    //Novice, Explorer, Knight, Merchant, etc
    private String skillName;
    private int skillLevel;

    public ItemSAOSkill(int par1, String par2Str, int par3)
    {
        super(par1);
        this.maxStackSize = 1;
        this.setCreativeTab(SAOMOD.saoTabs);
        this.skillName = par2Str;
        this.skillLevel = par3;
    }

    public String getSkillName()
    {
        return this.skillName;
    }

    public int getSkillLevel()
    {
        return this.skillLevel;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void updateIcons(IconRegister par1IconRegister)
    {
        this.iconIndex = par1IconRegister.registerIcon("SAO:" + this.getUnlocalizedName());
    }
}