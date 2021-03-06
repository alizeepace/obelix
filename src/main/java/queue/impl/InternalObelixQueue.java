/**
 * This file is part of Obelix.
 *
 * Obelix is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Obelix is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Obelix.  If not, see <http://www.gnu.org/licenses/>.
 */
package queue.impl;

import queue.interfaces.ObelixQueue;

import java.util.ArrayList;
import java.util.List;

public class InternalObelixQueue implements ObelixQueue {

    private List<ObelixQueueElement> queue;

    public InternalObelixQueue() {
        this.queue = new ArrayList<>();
    }

    @Override
    public final ObelixQueueElement pop() {
        if (this.queue.size() < 1) {
            return null;
        }
        ObelixQueueElement result = this.queue.get(0);
        this.queue.remove(0);
        return result;
    }

    @Override
    public final void push(final ObelixQueueElement element) {
        this.queue.add(element);
    }

    @Override
    public final List<ObelixQueueElement> getAll() {
        return queue;
    }

}
