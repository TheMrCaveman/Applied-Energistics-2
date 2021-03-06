/*
 * This file is part of Applied Energistics 2.
 * Copyright (c) 2013 - 2014, AlgorithmX2, All rights reserved.
 *
 * Applied Energistics 2 is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Applied Energistics 2 is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Applied Energistics 2.  If not, see <http://www.gnu.org/licenses/lgpl>.
 */

package appeng.parts.reporting;


import java.util.List;

import com.google.common.collect.ImmutableList;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import appeng.core.AppEng;
import appeng.helpers.Reflected;
import appeng.items.parts.PartModels;


public class PartDarkPanel extends AbstractPartPanel
{

	@PartModels
	public static final ResourceLocation MODEL_OFF = new ResourceLocation( AppEng.MOD_ID, "part/monitor_dark_off" );
	@PartModels
	public static final ResourceLocation MODEL_ON = new ResourceLocation( AppEng.MOD_ID, "part/monitor_dark_on" );

	public static final List<ResourceLocation> MODELS_OFF = ImmutableList.of( MODEL_BASE, MODEL_OFF );
	public static final List<ResourceLocation> MODELS_ON = ImmutableList.of( MODEL_BASE, MODEL_ON );

	@Reflected
	public PartDarkPanel( final ItemStack is )
	{
		super( is );
	}

	@Override
	protected int getBrightnessColor()
	{
		return this.getColor().mediumVariant;
	}

	@Override
	public List<ResourceLocation> getStaticModels()
	{
		return isPowered() ? MODELS_ON : MODELS_OFF;
	}

}
