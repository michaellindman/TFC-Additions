package org.rbh.tfcadditions.Blocks.Dent;

import com.bioxx.tfc.Core.TFCTabs;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;
import org.rbh.tfcadditions.Blocks.BlockChisel;
import org.rbh.tfcadditions.Reference.Names;

/**
 * Created by raymondbh on 19.08.2015.
 */
public class BlockPlank2Dent extends BlockChisel {
    public BlockPlank2Dent()
    {
        super(Material.wood, "wood", "Plank Outline");
        this.setCreativeTab(TFCTabs.TFCBuilding);
        String[] MetaNames = new String[Names.WOOD_ALL.length-16];
        System.arraycopy(Names.WOOD_ALL, 16, MetaNames, 0, Names.WOOD_ALL.length-16);
        names = MetaNames;
        icons = new IIcon[names.length];
    }
}
