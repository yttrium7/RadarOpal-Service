package com.example.vulpix.maphelper.controller.activity;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mock;


import static org.mockito.Mockito.when;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LoginActivityTest {


    @Mock
    private Viewer view;

    private TestPresenter presenter;


    @Before
    public void setUp() throws Exception {
        presenter = new TestPresenter(view);
    }

    @After
    public void tearDown() throws Exception {

    }
    
    //test if the Email is Empty
    @Test
    public void EmailIsEmpty() throws Exception {
        when(view.getEmail()).thenReturn("");
        assertEquals("Empty Email", presenter.onLoginClicked());

    }

    //test if the Password is Empty
    @Test
    public void PswIsEmpty() throws Exception {
        when(view.getEmail()).thenReturn("123@example.com");
        when(view.getPsw()).thenReturn("");
        assertEquals("Empty Password", presenter.onLoginClicked());

    }


}
