/*
 * Copyright (C) 2008 feilong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.feilong.core.lang;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.io.Serializable;

import org.apache.commons.lang3.ClassUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.feilong.core.DatePattern;
import com.feilong.core.FeiLongVersion;
import com.feilong.test.User;
import com.feilong.tools.jsonlib.JsonUtil;

/**
 * The Class ClassUtilTest.
 *
 * @author <a href="http://feitianbenyue.iteye.com/">feilong</a>
 * @since 1.0.8
 */
public class ClassUtilTest{

    /** The Constant LOGGER. */
    private static final Logger LOGGER = LoggerFactory.getLogger(ClassUtilTest.class);

    /**
     * Test get class.
     *
     * @throws ClassNotFoundException
     *             the class not found exception
     */
    @Test
    public void testGetClass() throws ClassNotFoundException{
        assertSame(FeiLongVersion.class, ClassUtil.getClass("com.feilong.core.FeiLongVersion"));
        assertSame(FeiLongVersion.class, ClassUtils.getClass("com.feilong.core.FeiLongVersion"));
    }

    /**
     * Test is instance.
     */
    @Test
    public void testIsInstance(){
        assertEquals(true, ClassUtil.isInstance(new User(), Comparable.class));
        assertEquals(true, ClassUtil.isInstance("1234", CharSequence.class));
        assertEquals(true, new User() instanceof Comparable);
        assertEquals(true, "1234" instanceof CharSequence);
    }

    @Test
    public void testIsInstance22(){
        Object object = 1;
        assertEquals(true, object instanceof Serializable);
    }

    /**
     * Test is instance2.
     */
    @Test
    public void testIsInstance2(){
        assertEquals(true, ClassUtil.isInstanceAnyClass(new User(), new Class<?>[] { Comparable.class, CharSequence.class }));
        assertEquals(false, ClassUtil.isInstanceAnyClass(new User(), new Class<?>[] { Integer.class, CharSequence.class }));
        assertEquals(true, ClassUtil.isInstanceAnyClass("1234", new Class<?>[] { Comparable.class, CharSequence.class }));
    }

    /**
     * Test is assignable from.
     */
    @Test
    public void testIsAssignableFrom(){
        assertEquals(true, ClassUtil.isAssignableFrom(Comparable.class, new User().getClass()));
        assertEquals(false, ClassUtil.isAssignableFrom(null, new User().getClass()));
        assertEquals(true, ClassUtil.isAssignableFrom(CharSequence.class, "1234".getClass()));
        assertEquals(false, ClassUtil.isAssignableFrom(CharSequence.class, null));
    }

    /**
     * Test is assignable from1.
     */
    @Test
    public void testIsAssignableFrom1(){
        //        Class<?>[] klsClasses = { "1234".getClass(), "55555".getClass() };
        //        assertEquals(true, ClassUtils.isAssignable(klsClasses, CharSequence.class));
        assertEquals(true, ClassUtils.isAssignable("1234".getClass(), CharSequence.class));
    }

    /**
     * Test is interface.
     */
    @Test
    public void testIsInterface(){
        assertEquals(false, ClassUtil.isInterface(null));
        assertEquals(false, ClassUtil.isInterface(this.getClass()));
        assertEquals(false, ClassUtil.isInterface(DatePattern.class));
    }

    /**
     * Test to class.
     */
    @Test
    public void testToClass(){
        assertArrayEquals(new Class[] { String.class, String.class }, ClassUtil.toClass("a", "a"));
        assertArrayEquals(new Class[] { Integer.class, Boolean.class }, ClassUtil.toClass(1, true));
    }

    /**
     * Test get class info map for LOGGER.
     */
    @Test
    public void testGetClassInfoMapForLog(){
        LOGGER.debug(JsonUtil.format(ClassUtil.getClassInfoMapForLog(this.getClass())));
        LOGGER.debug(JsonUtil.format(ClassUtil.getClassInfoMapForLog(DatePattern.class)));
    }
}
