/*
 * JBoss, Home of Professional Open Source
 * Copyright 2009, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 *
 * (C) 2009,
 * @author JBoss Inc.
 */
package org.jboss.jbossts.qa.junit.testgroup;

import org.junit.Ignore;
import org.junit.Test;

public class TestGroup_jdbcresources01_ibmdb2_jndi extends TestGroup_jdbcresources01_abstract
{
	public String getTestGroupName() {
		return "jdbcresources01_ibmdb2_jndi";
	}

    public String getDBName1() {
        return "DB1_IBMDB2_JNDI";
    }

    public String getDBName2() {
        return "DB2_IBMDB2_JNDI";
    }

    // these 4 tests deadlock on db2, disable until we can figure out how to force row level locking.
    @Ignore @Test public void JDBCResources01_abstract_Test014() {}
    @Ignore @Test public void JDBCResources01_abstract_Test016() {}
    @Ignore @Test public void JDBCResources01_abstract_Test019() {}
    @Ignore @Test public void JDBCResources01_abstract_Test021() {}
}
