package id.sch.smktelkom_mlg.www.fragment2.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import id.sch.smktelkom_mlg.www.fragment2.R;

public class TulipFragment extends Fragment {
    public TulipFragment() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle saveInstanceState) {

        View rootView = inflater.inflate(R.layout.tulip_multiple_fragment, container, false);

        Button btnTulip = (Button)rootView.findViewById(R.id.btnTulip);

        btnTulip.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Kamu Telah Klik Bunga Tulip", Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }

}
