package com.example.safe_eats;

import java.util.Dictionary;
import java.util.HashMap;

public interface OnRestaurantsLoadedListener {
    void onLoadedEvent(HashMap<String, Restaurant> restaurants);
}
