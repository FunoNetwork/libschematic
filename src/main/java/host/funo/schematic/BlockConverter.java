package host.funo.schematic;

import io.gomint.world.block.*;

public class BlockConverter {

    // TODO: data
    public static Class<? extends Block> getType(int id) {
        switch (id) {
            case 1:
                return BlockStone.class;
            case 2:
                return BlockGrassBlock.class;
            case 3:
                return BlockDirt.class;
            case 4:
                return BlockCobblestone.class;
            case 5:
                return BlockWood.class;
            case 6:
                return BlockSapling.class;
            case 7:
                return BlockBedrock.class;
            case 8:
                return BlockFlowingWater.class;
            case 9:
                return BlockStationaryWater.class;
            case 10:
                return BlockFlowingLava.class;
            case 11:
                return BlockStationaryLava.class;
            case 12:
                return BlockSand.class;
            case 13:
                return BlockGravel.class;
            case 14:
                return BlockGoldOre.class;
            case 15:
                return BlockIronOre.class;
            case 16:
                return BlockCoalOre.class;
            case 17:
                return BlockLog.class;
            case 18:
                return BlockLeaves.class;
            case 19:
                return BlockSponge.class;
            case 20:
                return BlockGlass.class;
            case 21:
                return BlockLapisLazuliOre.class;
            case 22:
                return BlockLapisLazuliBlock.class;
            case 23:
                return BlockDispenser.class;
            case 24:
                return BlockSandstone.class;
            case 25:
                return BlockNoteblock.class;
            case 26:
                return BlockBed.class;
            case 27:
                return BlockPoweredRail.class;
            case 28:
                return BlockDetectorRail.class;
            case 29:
                return BlockStickyPiston.class;
            case 30:
                return BlockCobweb.class;
            case 32:
                return BlockDeadBush.class;
            case 33:
                return BlockPiston.class;
            case 34:
                return BlockPistonHead.class;
            case 35:
                return BlockWool.class;
            case 37:
                return BlockDandelion.class;
            case 38:
                return BlockFlower.class;
            case 39:
                return BlockBrownMushroom.class;
            case 40:
                return BlockRedMushroom.class;
            case 41:
                return BlockBlockOfGold.class;
            case 42:
                return BlockBlockOfIron.class;
            case 43:
                return BlockDoubleStoneSlab.class;
            case 44:
                return BlockStoneSlab.class;
            case 45:
                return BlockBrickBlock.class;
            case 46:
                return BlockTNT.class;
            case 47:
                return BlockBookshelf.class;
            case 48:
                return BlockMossyCobblestone.class;
            case 49:
                return BlockObsidian.class;
            case 50:
                return BlockTorch.class;
            case 51:
                return BlockFire.class;
            case 52:
                return BlockMobSpawner.class;
            case 53:
                return BlockOakWoodStairs.class;
            case 54:
                return BlockChest.class;
            case 55:
                return BlockRedstoneWire.class;
            case 56:
                return BlockDiamondOre.class;
            case 57:
                return BlockBlockOfDiamond.class;
            case 58:
                return BlockCraftingTable.class;
            case 59:
                return BlockCrops.class;
            case 60:
                return BlockFarmland.class;
            case 61:
                return BlockFurnace.class;
            case 63:
                return BlockSign.class;
            case 64:
                return BlockWoodenDoor.class;
            case 65:
                return BlockLadder.class;
            case 66:
                return BlockRail.class;
            case 67:
                return BlockCobblestoneStairs.class;
            case 68:
                return BlockWallSign.class;
            case 69:
                return BlockLever.class;
            case 70:
                return BlockStonePressurePlate.class;
            case 71:
                return BlockIronDoor.class;
            case 72:
                return BlockWoodenPressurePlate.class;
            case 73:
                return BlockRedstoneOre.class;
            case 74:
                return BlockGlowingRedstoneOre.class;
            case 75:
                return BlockRedstoneTorchInactive.class;
            case 76:
                return BlockRedstoneTorchActive.class;
            case 77:
                return BlockStoneButton.class;
            case 78:
                return BlockSnowLayer.class;
            case 79:
                return BlockIce.class;
            case 80:
                return BlockSnow.class;
            case 81:
                return BlockCactus.class;
            case 82:
                return BlockClay.class;
            case 83:
                return BlockSugarCane.class;
            case 84:
                return BlockJukebox.class;
            case 85:
                return BlockFence.class;
            case 86:
                return BlockPumpkin.class;
            case 87:
                return BlockNetherrack.class;
            case 88:
                return BlockSoulSand.class;
            case 89:
                return BlockGlowstone.class;
            case 90:
                return BlockPortal.class;
            case 91:
                return BlockJackOLantern.class;
            case 92:
                return BlockCake.class;
            case 93:
                return BlockRedstoneRepeaterInactive.class;
            case 94:
                return BlockRedstoneRepeaterActive.class;
            case 95:
                return BlockStainedGlass.class;
            case 96:
                return BlockTrapdoor.class;
            case 98:
                return BlockStoneBrick.class;
            case 99:
                return BlockBrownMushroomBlock.class;
            case 100:
                return BlockRedMushroomBlock.class;
            case 101:
                return BlockIronBars.class;
            case 102:
                return BlockGlassPane.class;
            case 103:
                return BlockMelon.class;
            case 104:
                return BlockPumpkinStem.class;
            case 105:
                return BlockMelonStem.class;
            case 106:
                return BlockVines.class;
            case 107:
                return BlockFenceGate.class;
            case 108:
                return BlockBrickStairs.class;
            case 109:
                return BlockStoneBrickStairs.class;
            case 110:
                return BlockMycelium.class;
            case 111:
                return BlockLilyPad.class;
            case 112:
                return BlockNetherBrick.class;
            case 113:
                return BlockNetherBrickFence.class;
            case 114:
                return BlockNetherBrickStairs.class;
            case 115:
                return BlockNetherWart.class;
            case 116:
                return BlockEnchantmentTable.class;
            case 117:
                return BlockBrewingStand.class;
            case 118:
                return BlockCauldron.class;
            case 119:
                return BlockEndPortal.class;
            case 120:
                return BlockEndPortalFrame.class;
            case 121:
                return BlockEndStone.class;
            case 122:
                return BlockDragonEgg.class;
            case 123:
                return BlockRedstoneLampInactive.class;
            case 124:
                return BlockRedstoneLampActive.class;
            case 125:
                return BlockWoodenDoubleSlab.class;
            case 126:
                return BlockWoodenSlab.class;
            case 127:
                return BlockCocoa.class;
            case 128:
                return BlockSandstoneStairs.class;
            case 129:
                return BlockEmeraldOre.class;
            case 130:
                return BlockEnderChest.class;
            case 131:
                return BlockTripwireHook.class;
            case 132:
                return BlockTripwire.class;
            case 133:
                return BlockBlockOfEmerald.class;
            case 134:
                return BlockSpruceWoodStairs.class;
            case 135:
                return BlockBirchWoodStairs.class;
            case 136:
                return BlockJungleWoodStairs.class;
            case 137:
                return BlockCommandBlock.class;
            case 138:
                return BlockBeacon.class;
            case 139:
                return BlockCobblestoneWall.class;
            case 140:
                return BlockFlowerPot.class;
            case 141:
                return BlockCarrots.class;
            case 142:
                return BlockPotato.class;
            case 143:
                return BlockWoodenButton.class;
            case 144:
                return BlockSkull.class;
            case 145:
                return BlockAnvil.class;
            case 146:
                return BlockTrappedChest.class;
            case 147:
                return BlockLightWeightedPressurePlate.class;
            case 148:
                return BlockHeavyWeightedPressurePlate.class;
            case 149:
                return BlockRedstoneComparatorUnpowered.class;
            case 150:
                return BlockRedstoneComparator.class;
            case 151:
                return BlockDaylightDetector.class;
            case 152:
                return BlockBlockOfRedstone.class;
            case 153:
                return BlockNetherQuartzOre.class;
            case 154:
                return BlockHopper.class;
            case 155:
                return BlockBlockOfQuartz.class;
            case 156:
                return BlockQuartzStairs.class;
            case 157:
                return BlockActivatorRail.class;
            case 158:
                return BlockDropper.class;
            case 159:
                return BlockHardenedClay.class;
            case 160:
                return BlockStainedGlassPane.class;
            case 164:
                return BlockDarkOakWoodStairs.class;
            case 165:
                return BlockSlimeBlock.class;
            case 166:
                return BlockBarrier.class;
            case 167:
                return BlockIronTrapdoor.class;
            case 168:
                return BlockPrismarine.class;
            case 169:
                return BlockSeaLantern.class;
            case 170:
                return BlockHayBale.class;
            case 171:
                return BlockCarpet.class;
            case 172:
                return BlockHardenedClay.class;
            case 173:
                return BlockBlockOfCoal.class;
            case 174:
                return BlockPackedIce.class;
            case 175:
                return BlockSunflower.class;
            case 176:
                return BlockStandingBanner.class;
            case 177:
                return BlockWallBanner.class;
            case 178:
                return BlockInvertedDaylightSensor.class;
            case 179:
                return BlockRedSandstone.class;
            case 180:
                return BlockRedSandstoneStairs.class;
            case 181:
                return BlockDoubleRedSandstoneSlab.class;
            case 185:
                return BlockJungleFenceGate.class;
            case 198:
                return BlockEndRod.class;
            case 199:
                return BlockChorusPlant.class;
            case 200:
                return BlockChorusFlower.class;
            case 201:
                return BlockPurpurBlock.class;
            case 203:
                return BlockPurpurStairs.class;
            case 206:
                return BlockEndBricks.class;
            case 207:
                return BlockBeetroot.class;
            case 208:
                return BlockGrassPath.class;
            case 209:
                return BlockEndGateway.class;
            case 210:
                return BlockRepeatingCommandBlock.class;
            case 211:
                return BlockChainCommandBlock.class;
            case 212:
                return BlockFrostedIce.class;
            case 213:
                return BlockMagma.class;
            case 214:
                return BlockNetherWartBlock.class;
            case 215:
                return BlockRedNetherBrick.class;
            case 216:
                return BlockOfBones.class;
            case 218:
                return BlockObserver.class;
            case 219:
                return BlockUndyedShulkerBox.class;
            case 251:
                return BlockConcrete.class;
            case 252:
                return BlockConcretePowder.class;
        }
        return BlockAir.class;
    }
}
