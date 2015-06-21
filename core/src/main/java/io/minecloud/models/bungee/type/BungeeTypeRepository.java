/*
 * Copyright (c) 2015, Mazen Kotb <email@mazenmc.io>
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */
package io.minecloud.models.bungee.type;

import io.minecloud.db.mongo.AbstractMongoRepository;
import io.minecloud.db.mongo.MongoDatabase;
import org.mongodb.morphia.Datastore;

public class BungeeTypeRepository extends AbstractMongoRepository<BungeeType> {

    private BungeeTypeRepository(Datastore datastore) {
        super(BungeeType.class, datastore);
    }

    public static BungeeTypeRepository create(Datastore datastore) {
        return new BungeeTypeRepository(datastore);
    }

    public BungeeType typeBy(String name) {
        return findFirst((model) -> model.name().equalsIgnoreCase(name));
    }
}
