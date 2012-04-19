/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright 2012 StarTux
 *
 * This file is part of CraftBay.
 *
 * CraftBay is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 * CraftBay is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with CraftBay.  If not, see <http://www.gnu.org/licenses/>.
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

package edu.self.startux.craftBay;

import org.bukkit.inventory.ItemStack;
import org.bukkit.command.CommandSender;

/**
 * This class is an abstract representation of a participant in an
 * auction, either as auctioneer or as bidder.
 * Typical actions are the giving, taking away and checking for
 * availability of items and money.
 * Primary motif for creating this abstraction is to manage both
 * players and The Bank in the same way.
 */
public interface Merchant {
        /**
         * Get the name of this Merchant.
         * @return the name
         */
        public String getName();

        /**
         * Check if this Merchant has a given amount
         * @param amount the amount
         * @return true if he has enough, false otherwise
         */
        public boolean hasAmount(int amount);

        /**
         * Add some money to this merchant's account.
         * @param amount the amount
         */
        public void giveAmount(int amount);

        /**
         * Debit this merchant's account.
         * @param amount the amount
         */
        public void takeAmount(int amount);

        /**
         * Check this merchant's inventory for availabilty of an
         * ItemStack.
         * @param lot the ItemStack
         * @return true if he as it, false otherwise
         */
        public boolean hasItem(ItemStack lot);

        /**
         * Remove an ItemStack from this merchant's inventory.
         * @param lot the ItemStack
         */
        public void takeItem(ItemStack lot);

        /**
         * Add an ItemStack to this merchant's inventory.
         * @param lot the ItemStack
         */
        public void giveItem(ItemStack lot);

        /**
         * Send a message to this merchant.
         * @param msg the message
         */
        public void msg(String msg);

        /**
         * Send a warning to this merchant.
         * @param msg the warning
         */
        public void warn(String msg);
}