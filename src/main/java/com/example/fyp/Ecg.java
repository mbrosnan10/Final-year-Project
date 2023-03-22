package com.example.fyp;

import androidx.fragment.app.Fragment;

public class Ecg extends Fragment {
    /*private static final int FIFO_CAPACITY = 7850;

    private static final String ECG_ID = "ecgId";
    private static final String BLOOD_PRESSURE_ID = "bloodPressureId";
    private static final String BLOOD_VOLUME_ID = "bloodVolumeId";
    private static final String BLOOD_OXYGENATION_ID = "bloodOxygenationId";
    private final VitalSignsIndicatorsProvider indicatorsProvider = new VitalSignsIndicatorsProvider();
    private final EcgDataBatch dataBatch = new EcgDataBatch();


    public Ecg() {
        // Required empty public constructor
    }
    private void updateIndicators(long time) {
        binding.heartRateIndicator.heartIcon.setVisibility(time % 2 == 0 ? View.VISIBLE : View.INVISIBLE);

        if (time % 5 == 0) {
            indicatorsProvider.update();
            binding.heartRateIndicator.bpmValueLabel.setText(indicatorsProvider.getBpmValue());

            binding.bloodPressureIndicator.bloodPressureValue.setText(indicatorsProvider.getBpValue());
            binding.bloodPressureIndicator.bloodPressureBar.setProgress(indicatorsProvider.getBpbValue());

            binding.bloodVolumeIndicator.bloodVolumeValueLabel.setText(indicatorsProvider.getBvValue());
            binding.bloodVolumeIndicator.svBar1.setProgress(indicatorsProvider.getBvBar1Value());
            binding.bloodVolumeIndicator.svBar2.setProgress(indicatorsProvider.getBvBar2Value());

            binding.bloodOxygenationIndicator.spoValueLabel.setText(indicatorsProvider.getSpoValue());
            binding.bloodOxygenationIndicator.spoClockLabel.setText(indicatorsProvider.getSpoClockValue());
        }
    }
s
    public static Ecg newInstance(String param1, String param2) {
        Ecg fragment = new Ecg();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ecg, container, false);
    }*/
}