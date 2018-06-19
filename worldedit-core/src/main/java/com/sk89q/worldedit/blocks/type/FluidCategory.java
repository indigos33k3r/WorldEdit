/*
 * WorldEdit, a Minecraft world manipulation toolkit
 * Copyright (C) sk89q <http://www.sk89q.com>
 * Copyright (C) WorldEdit team and contributors
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.sk89q.worldedit.blocks.type;

import java.util.Collections;
import java.util.Set;

/**
 * A category of fluids. This is due to the splitting up of
 * blocks such as wool into separate ids.
 */
public class FluidCategory {

    private final String id;

    public FluidCategory(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public Set<FluidType> getFluidTypes() {
        return Collections.emptySet(); // TODO Make this work.
        //        return WorldEdit.getInstance().getPlatformManager()
//                .queryCapability(Capability.GAME_HOOKS).getRegistries()
//                .getBlockCategoryRegistry().getCategorisedByName(this.id);
    }

    /**
     * Checks whether the FluidType is contained within
     * this category.
     *
     * @param fluidType The fluidType
     * @return If it's a part of this category
     */
    public boolean contains(FluidType fluidType) {
        return getFluidTypes().contains(fluidType);
    }
}
