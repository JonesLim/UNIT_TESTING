package com.jones.unit_testing.core.util

import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class ValidationUtilTest {
    @Test
    fun `validationEmail should return true for g@c,com`() {
        assertTrue(ValidationUtil.validateEmail("g@c.com"))
    }

    @Test
    fun `validationEmail should return false for g@cwy`() {
        assertFalse(ValidationUtil.validateEmail("g@cwy"))
    }

    @Test
    fun `validationEmail should return false for g@c,com$`() {
        assertFalse(ValidationUtil.validateEmail("g@c.com$"))
    }

}