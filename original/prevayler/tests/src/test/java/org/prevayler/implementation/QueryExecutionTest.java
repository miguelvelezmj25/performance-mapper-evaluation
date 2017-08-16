//Prevayler(TM) - The Free-Software Prevalence Layer.
//Copyright (C) 2001-2003 Klaus Wuestefeld
//This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.

package org.prevayler.implementation;

import org.prevayler.Prevayler;
import org.prevayler.PrevaylerFactory;
import org.prevayler.Query;
import org.prevayler.TransactionWithQuery;
import org.prevayler.foundation.FileIOTest;

import java.util.Date;
import java.util.LinkedList;


public class QueryExecutionTest extends FileIOTest {

    private static Query<LinkedList, Integer> query() {
        return new Query<LinkedList, Integer>() {
            public Integer query(LinkedList prevalentSystem, Date ignored) throws Exception {
                return new Integer(prevalentSystem.size());
            }
        };
    }

    private static TransactionWithQuery<LinkedList, String> transactionWithQuery() {
        return new TransactionWithQuery<LinkedList, String>() {
            private static final long serialVersionUID = -2976662596936807721L;

            public String executeAndQuery(LinkedList prevalentSystem, Date timestamp) {
                prevalentSystem.add("added element");
                return "abc";
            }
        };
    }

    public void testQuery() throws Exception {
        LinkedList prevalentSystem = new LinkedList();
        Prevayler<LinkedList> prevayler = PrevaylerFactory.createTransientPrevayler(prevalentSystem);
        Integer result = prevayler.execute(query());
        assertEquals(0, result.intValue());
    }

    public void testTransactionWithQuery() throws Exception {
        LinkedList prevalentSystem = new LinkedList();
        Prevayler<LinkedList> prevayler = PrevaylerFactory.createTransientPrevayler(prevalentSystem);
        String result = prevayler.execute(transactionWithQuery());
        assertEquals("abc", result);
        assertEquals("added element", prevalentSystem.get(0));
    }

}
