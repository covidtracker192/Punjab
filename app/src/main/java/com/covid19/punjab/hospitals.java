package com.covid19.punjab;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class hospitals extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    LatLng latLng;
    private FusedLocationProviderClient fusedLocationClient;
    LocationRequest mLocationRequest;
    Location mLastLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
        mLocationRequest = new LocationRequest();
        mLocationRequest.setInterval(180000);
        mLocationRequest.setFastestInterval(90000);
        mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
        fusedLocationClient.requestLocationUpdates(mLocationRequest, mLocationCallback, Looper.myLooper());
        mMap.setMyLocationEnabled(true);

        // Test Center 1
        final LatLng center1 = new LatLng(30.866939, 75.560872);
        mMap.addMarker(new MarkerOptions().position(center1).title("District Hospital Barnala"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center1));

        //Test Center 2
        final LatLng center2 = new LatLng(31.062481, 74.773556);
        mMap.addMarker(new MarkerOptions().position(center2).title("Guru Gobind Singh Medical College and Hospital").snippet("website: http://www.ggsmch.org/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center2));

        //Test Center 3
        final LatLng center3 = new LatLng(31.251005, 75.085481);
        mMap.addMarker(new MarkerOptions().position(center3).title("District Hospital Moga"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center3));

        //Test Center 4
        final LatLng center4 = new LatLng(30.913946, 75.823003);
            mMap.addMarker(new MarkerOptions().position(center4).title("Department of Microbiology Dayanand Medical College & Hospital").snippet("website: https://www.dmch.edu/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center4));

        //Test Center 5
        final LatLng center5 = new LatLng(31.296653, 75.876060);
        mMap.addMarker(new MarkerOptions().position(center5).title("District Hospital Ludhiana"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center5));

        //Test Center 6
        final LatLng center6 = new LatLng(31.334867, 75.920006);
        mMap.addMarker(new MarkerOptions().position(center6).title("Christian Medical College & Hospital").snippet("website: https://www.cmcludhiana.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center6));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center6));

        //Test Center 7
        final LatLng center7 = new LatLng(31.431749, 76.117787);
        mMap.addMarker(new MarkerOptions().position(center7).title("District Hospital SBS Nagar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center7));

        //Test Center 8
        final LatLng center8 = new LatLng(31.725220, 75.656387);
        mMap.addMarker(new MarkerOptions().position(center8).title("Military Hospital"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center8));

        //Test Center 9
        final LatLng center9 = new LatLng(31.754556, 75.590472);
        mMap.addMarker(new MarkerOptions().position(center9).title("District Hospital Jalandhar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center9));

        //Test Center 10
        final LatLng center10 = new LatLng(31.750942, 75.356736);
        mMap.addMarker(new MarkerOptions().position(center10).title("District Hospital Kapurthala"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center10));

        //Test Center 11
        final LatLng center11 = new LatLng(31.981213, 74.821922);
        mMap.addMarker(new MarkerOptions().position(center11).title("Dr. Bhasin Path Labs & Ultrasound").snippet("website: http://www.drbhasinpathlabs.com/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center11));

        //Test Center 12
        final LatLng center12 = new LatLng(32.121350, 74.843898);
        mMap.addMarker(new MarkerOptions().position(center12).title("Government Medical College, Amritsar").snippet("webiste: http://gmc.edu.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center12));

        //Test Center 13
        final LatLng center13 = new LatLng(32.009476, 74.865870);
        mMap.addMarker(new MarkerOptions().position(center13).title("Tuli Diagnostic Centre").snippet("website: https://www.tulilabs.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center13));

        //Test Center 14
        final LatLng center14 = new LatLng(31.999214, 75.876144);
        mMap.addMarker(new MarkerOptions().position(center14).title("District Hospital Hoshiarpur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center14));

        //Test Center 15
        final LatLng center15 = new LatLng(32.437523, 75.378789);
        mMap.addMarker(new MarkerOptions().position(center15).title("District Hospital Gurdaspur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center15));

        //Test Center 16
        final LatLng center16 = new LatLng(31.863749, 76.227699);
        mMap.addMarker(new MarkerOptions().position(center16).title("Regional Hospital"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center16));


        mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                if(marker.getPosition().equals(center2)) {
                    Uri uriUrl = Uri.parse("http://www.ggsmch.org/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center4)) {
                    Uri uriUrl = Uri.parse("https://www.dmch.edu/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }

                else if(marker.getPosition().equals(center6)) {
                    Uri uriUrl = Uri.parse("https://www.cmcludhiana.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center11)) {
                    Uri uriUrl = Uri.parse("http://www.drbhasinpathlabs.com/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center12)) {
                    Uri uriUrl = Uri.parse("http://gmc.edu.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center13)) {
                    Uri uriUrl = Uri.parse("https://www.tulilabs.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
            }
        });

    }

    LocationCallback mLocationCallback=new LocationCallback(){
        @Override
        public void onLocationResult(LocationResult locationResult) {
            for(Location location1 : locationResult.getLocations()) {
                if (getApplicationContext() != null) {
                    mLastLocation = location1;
                    latLng = new LatLng(location1.getLatitude(), location1.getLongitude());
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
                    mMap.animateCamera(CameraUpdateFactory.zoomTo(7));
                }
            }

        }
    };
    public void onBackPressed(){
        Intent intent = new Intent(hospitals.this, home.class);
        startActivity(intent);
        finish();
    };
}
