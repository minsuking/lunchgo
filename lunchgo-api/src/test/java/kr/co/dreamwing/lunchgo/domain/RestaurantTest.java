package kr.co.dreamwing.lunchgo.domain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void creation(){
        Restaurant restaurant = new Restaurant("Bob zip");
        assertThat(restaurant.getName(), is("Bob zip"));
    }

}