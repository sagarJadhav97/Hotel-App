package com.fydhos.tsj97.hotel_sec;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.fydhos.tsj97.R;

import com.fydhos.tsj97.hotel_sec.room_desing_sec.Adapter_room;
import com.fydhos.tsj97.hotel_sec.room_desing_sec.data_process;

import java.util.ArrayList;


public class hotel extends Fragment {
    TextView textview;
    ImageSlider imageSlider;
    RecyclerView recyclerView,recyclerView1,recyclerView2,recyclerView3,recyclerView4,recyclerView5;
    ArrayList<data_process> list_dat;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_hotel, container, false);
        imageSlider = v.findViewById(R.id.img_slider);
        textview = v.findViewById(R.id.search_box_click);

        //search bar function
        textview.setOnClickListener((View v1) -> {
            Intent intent = new Intent(getActivity(), search_bar_activity.class);
            startActivity(intent);
        });

        //card view image show
        ArrayList<SlideModel> img = new ArrayList<>();
        img.add(new SlideModel("https://bit.ly/2YoJ77H",null));
        img.add(new SlideModel("https://bit.ly/2BteuF2",null));
        img.add(new SlideModel("https://bit.ly/2YoJ77H",null));
        img.add(new SlideModel("https://bit.ly/2BteuF2",null));
        imageSlider.setImageList(img, ScaleTypes.CENTER_CROP);

        //home_fydhos best rooms
        recyclerView = (RecyclerView) v.findViewById(R.id.fyd_sp_room);
        list_dat = new ArrayList<>();
        list_dat.add(new data_process("https://images.unsplash.com/photo-1590073242678-70ee3fc28e8e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=708&q=80","cidco hotel","baihipura","$200 off20%"));
        list_dat.add(new data_process("https://images.unsplash.com/photo-1564501049412-61c2a3083791?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8aG90ZWx8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60","ggggg","baihipura","$200 off20%"));
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(manager);
        Adapter_room adoter = new Adapter_room(getActivity(),list_dat);
        recyclerView.setAdapter(adoter);

        //fydhos_recommended
        recyclerView1 = (RecyclerView) v.findViewById(R.id.fyd_hotel_recom);
        list_dat = new ArrayList<>();
        list_dat.add(new data_process("https://images.unsplash.com/photo-1590073242678-70ee3fc28e8e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=708&q=80","SAgar","baihipura","$200 off20%"));
        list_dat.add(new data_process("https://images.unsplash.com/photo-1564501049412-61c2a3083791?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8aG90ZWx8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60","SAgar","baihipura","$200 off20%"));
        LinearLayoutManager manager1 = new LinearLayoutManager(getActivity());
        manager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView1.setLayoutManager(manager1);
        Adapter_room adoter1 = new Adapter_room(getActivity(),list_dat);
        recyclerView1.setAdapter(adoter1);

        //Single bad Rooms
        recyclerView2 = (RecyclerView) v.findViewById(R.id.single_room_id_home);
        list_dat = new ArrayList<>();
        list_dat.add(new data_process("https://bit.ly/2YoJ77H","Sagar Hotel","cidco","$100"));
        LinearLayoutManager manager2 = new LinearLayoutManager(getActivity());
        manager2.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView2.setLayoutManager(manager2);
        Adapter_room adapter2 = new Adapter_room(getActivity(),list_dat);
        recyclerView2.setAdapter(adapter2);


        //Double bad Rooms
        recyclerView3 = (RecyclerView) v.findViewById(R.id.double_bad_rooms_id_home);
        list_dat = new ArrayList<>();
        list_dat.add(new data_process("https://images.unsplash.com/photo-1590073242678-70ee3fc28e8e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=708&q=80","SAgar","baihipura","$200 off20%"));
        list_dat.add(new data_process("https://images.unsplash.com/photo-1564501049412-61c2a3083791?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8aG90ZWx8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60","SAgar","baihipura","$200 off20%"));
        list_dat.add(new data_process("https://images.unsplash.com/photo-1566073771259-6a8506099945?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8aG90ZWx8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60","SAgar","baihipura","$200 off20%"));
        list_dat.add(new data_process("https://images.unsplash.com/photo-1522798514-97ceb8c4f1c8?ixid=MnwxMjA3fDB8MHxzZWFyY2h8N3x8aG90ZWx8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60","SAgar","baihipura","$200 off20%"));
        list_dat.add(new data_process("https://images.unsplash.com/photo-1542314831-068cd1dbfeeb?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTF8fGhvdGVsfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60","SAgar","baihipura","$200 off20%"));
        list_dat.add(new data_process("https://images.unsplash.com/photo-1571003123894-1f0594d2b5d9?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTZ8fGhvdGVsfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60","SAgar","baihipura","$200 off20%"));
        list_dat.add(new data_process("https://images.unsplash.com/photo-1562790351-d273a961e0e9?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTl8fGhvdGVsfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60","SAgar","baihipura","$200 off20%"));
        LinearLayoutManager manager3 = new LinearLayoutManager(getActivity());
        manager3.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView3.setLayoutManager(manager3);
        Adapter_room adapter3 = new Adapter_room(getActivity(),list_dat);
        recyclerView3.setAdapter(adapter3);

        //family room
        recyclerView4 = (RecyclerView) v.findViewById(R.id.family_room_id_home);
        list_dat = new ArrayList<>();
        list_dat.add(new data_process("https://images.unsplash.com/photo-1590073242678-70ee3fc28e8e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=708&q=80","SAgar","baihipura","$200 off20%"));
        list_dat.add(new data_process("https://images.unsplash.com/photo-1564501049412-61c2a3083791?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8aG90ZWx8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60","SAgar","baihipura","$200 off20%"));
        list_dat.add(new data_process("https://images.unsplash.com/photo-1566073771259-6a8506099945?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8aG90ZWx8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60","SAgar","baihipura","$200 off20%"));
        LinearLayoutManager manager4 = new LinearLayoutManager(getActivity());
        manager4.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView4.setLayoutManager(manager4);
        Adapter_room adapter4 = new Adapter_room(getActivity(),list_dat);
        recyclerView4.setAdapter(adapter4);

        //
        recyclerView5 = (RecyclerView) v.findViewById(R.id.couple_room_id_home);
        list_dat = new ArrayList<>();
        list_dat.add(new data_process("https://images.unsplash.com/photo-1590073242678-70ee3fc28e8e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=708&q=80","SAgar","baihipura","$200 off20%"));
        list_dat.add(new data_process("https://images.unsplash.com/photo-1564501049412-61c2a3083791?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8aG90ZWx8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60","SAgar","baihipura","$200 off20%"));
        list_dat.add(new data_process("https://images.unsplash.com/photo-1566073771259-6a8506099945?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8aG90ZWx8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60","SAgar","baihipura","$200 off20%"));
        LinearLayoutManager manager5 = new LinearLayoutManager(getActivity());
        manager5.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView5.setLayoutManager(manager5);
        Adapter_room adapter5 = new Adapter_room(getActivity(),list_dat);
        recyclerView5.setAdapter(adapter5);


        return v;
    }
}