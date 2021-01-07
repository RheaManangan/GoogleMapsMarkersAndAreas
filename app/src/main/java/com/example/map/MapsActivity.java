package com.example.map;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
      LatLng StoTomas = new LatLng(15.870465, 120.571128);
      mMap.addMarker(new MarkerOptions().position(StoTomas).title("Santo Tomas"));
       mMap.moveCamera(CameraUpdateFactory.newLatLng(StoTomas));

        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(15.870465,120.571128),
                        new LatLng(15.86670, 120.56658),
                        new LatLng(15.87265, 120.56966),
                        new LatLng(15.87298, 120.57172),
                        new LatLng(15.87974, 120.58693),
                        new LatLng(15.88733, 120.59688),
                        new LatLng(15.89691, 120.59070),
                        new LatLng(15.91177, 120.58349),
                        new LatLng(15.92134, 120.58178),
                        new LatLng(15.928276435901243, 120.58006093884173),
                        new LatLng(15.937850302658529, 120.58109090703617),
                        new LatLng(15.946763492097253, 120.5804042615732),
                        new LatLng(15.962608183854806, 120.57319448421217),
                        new LatLng(15.962938268277002, 120.56598470685114),
                        new LatLng(15.961287840726692, 120.5574016385642),
                        new LatLng(15.960957753584882, 120.55705831583273),
                        new LatLng(15.971850342028898, 120.55499837944386),
                        new LatLng(15.983670608100802, 120.5555133558256),
                        new LatLng(15.984000657791798, 120.5563716626543),

                        new LatLng(15.981855324872255, 120.56014821286875),
                        new LatLng(15.980535108682686, 120.56057736628307))
                .width(10)
                .color(Color.RED));


        LatLng StoTomas2 = new LatLng(15.870490, 120.571155);
        mMap.addMarker(new MarkerOptions().position(StoTomas2).title("Santo Tomas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(StoTomas2));

        LatLng cayambanan = new LatLng(15.9955, 120.5941);
        mMap.addMarker(new MarkerOptions().position(cayambanan).title("Cayambanan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(cayambanan));

        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(15.9955,120.5941),
                        new LatLng(15.996420030736145, 120.59273903507648),
                        new LatLng(15.996585045127254, 120.59196655893065),
                        new LatLng(15.995017402910989, 120.59067909868762),
                        new LatLng(15.993697273613575, 120.58827583956726),
                        new LatLng(15.994171696186704, 120.58909123084146),
                        new LatLng(15.98750905132757, 120.5822676917664),
                        new LatLng(15.98437361227296, 120.58072273947475),
                        new LatLng(15.982063257307523, 120.58012192469468),
                        new LatLng(15.979670361536098, 120.57110970299338),
                        new LatLng(15.97909276171727, 120.56570236997261),
                        new LatLng(15.98156817777198, 120.56106751309767),
                        new LatLng(15.978907104153283, 120.5656594541714),
                        new LatLng(15.9819601157134, 120.5601233751263),

                        new LatLng(15.980567700669454, 120.5603808665301),
                        new LatLng(15.980535108682686, 120.56057736628307))
                .width(10)
                .color(Color.RED));

        LatLng urdaneta = new LatLng(15.980535108682686, 120.56057736628307);
        mMap.addMarker(new MarkerOptions().position(urdaneta).title("Marker in Urdaneta City"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(urdaneta));


    }
}
