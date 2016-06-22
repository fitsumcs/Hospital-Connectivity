package com.example.yohannes.appbutton.embassys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.yohannes.appbutton.R;

public class EmbassyMainActivity extends AppCompatActivity {

    private ListView listView;
    private String names[] = {
            "Embassy of Algeria",
            "Embassy of Angola",
            "Embassy of Australian ",
            "Embassy of Belgium",
            "Embassy of Botswana",
            "Embassy of Brazil",
            "Embassy of Canada",
            "Embassy of China",
            "Embassy of Cuba",
            "Embassy of Czech",
            "Embassy of Djibouti",
            "Embassy of Egypt",
            "Embassy of Finland",
            "Embassy of France",
            "Embassy of Gabon",
            "Embassy of German",
            "Embassy of Ghana",
            "Embassy of Greece",
            "Embassy of Hungary",
            "Embassy of India",
            "Embassy of Indonesia",
            "Embassy of Iran",
            "Embassy of Isreal",
            "Embassy of Italy",
            "Embassy of Japan",
            "Embassy of Kenya",
            "Embassy of Kuwait",
            "Embassy of Sierra Leone",
            "Embassy of Madagascar",
            "Embassy of Malawi",
            "Embassy of Mali",
            "Embassy of Mautitius",
            "Embassy of Mexico",
            "Embassy of Morocco",
            "Embassy of Mazambique",
            "Embassy of Namibia",
            "Embassy of Niger",
            "Embassy of Niggeria",
            "Embassy of Pakistan",
            "Embassy of Palestine",
            "Embassy of Portugal",
            "Embassy of Romania",
            "Embassy of Russia",
            "Embassy of Rwanda",
            "Embassy of Serbia",
            "Embassy of South Africa",
            "Embassy of Spain",
            "Embassy of Sudan",
            "Embassy of Swedene",
            "Embassy of Switherland",
            "Embassy of Tanzania",
            "Embassy of Togo",
            "Embassy of Tunisia",
            "Embassy of Turkey",
            "Embassy of Uganda",
            "Embassy of Ukraine",
            "Embassy of Yemen",
            "Embassy of Zambia",
            "Embassy of Zimbabwe"
    };

    private String desc[] = {
            "Address : Nifas Silk Lafto K. Ketema\n" + "Phone : 2511 71 9666 or 2511 20 5757 ",
            "Address : Rue Bole Road Wrada 18 Kebele 26\n House No 006 CP 2962\n" +
                    "Phone : 251 1 710118 or 251 1 711528\n" +
                    "Email : angola.embassy@telecom.net.et",
            "Address : Hilton Hotel, Addis Ababa\n" +
                    "Phone : +251 11 552 3197 ",
            "Address : Kebena District Comoros \nStreet Kebele 08, Addis Ababa\n" +
                    "Phone : +251 11 662.12.91 \n" +
                    "Email : AddisAbaba@diplobel.org",
            "Address : 22282\n" +
                    "Phone : (2511) 715422 ",
            "Address : Kebele 02 Bole Sub-City,\n House Nr. 2830,\n" +
                    "Phone : (25111) 662-0401 \n" +
                    "Email : embradisadm@ethionet.et",
            "Address : Wereda 23 Kebele 12,\n House # 122, Addis Ababa\n" +
                    "Phone : +251 11 371 3022\n" +
                    "Email : addis@international.gc.ca",
            "Address : Jimma Road, Higher24, Kebele 13,\n House No.792, Addis Ababa\n" +
                    "Phone : 002511-711960\n" +
                    "Email : chinaemb_et@mfa.gov.cn",
            "Address : Woreda 17, Kebele 19 Casa 197(Bole area)\n" +
                    "Phone : (251-1) 62 0459 \n" +
                    "Email : etcubemb@telecom.net.et",
            "Address : Kirkos Kifle Ketema Rd.,Kebele 15\n House No. 289, Addis Ababa\n" +
                    "Phone : 00251/11/5516382\n" +
                    "Email : addisabeba@embassy.mzv.cz",
            "Address : W17, K19, - House No. 003\n" +
                    "Phone : (+251-1) 613200\n" +
                    "Email : ibrahim_kamil@hotmail.com",
            "Address : SIDIST KILO, Gulele Sub-City, Kebele 02 Addis Ababa\n" +
                    "Phone : (002511) 1226422 ",
            "Address : Mauritania Street Nifas Silk \nLafto Kifle Ketema \nKebele 12 House No 1431\n" +
                    "Phone : +251-11-320 5920\n" +
                    "Email : sanomat.add@formin.fi",
            "Address : Quartier Kabana, Addis Ababa\n" +
                    "Phone : [251] (11) 140 00 00\n" +
                    "Email : presse@france-ethiopie.org",
            "Address : Bole Road H-17 House 269\n" +
                    "Phone : (251-1) 61 10 75",
            "Address : Khabana, Woreda 12 Kabele 20, Addis Ababa\n" +
                    "Phone : 251 1 55 04 33\n" +
                    "Email : german.emb.addis@telecom.net.et",
            "Address : Addis ababa\n" +
                    "Phone : 0111 71-14-02,\n Telex: 21249 GhanaEmb ET",
            "Address : Off Debre Zeit Road, Addis Abeba\n" +
                    "Phone : (002511) 6549112\n" +
                    "Email : greekeembassy@telecom.net.et",
            "hungary",
            "Address : Arada District, Kebele-14 [Next to Bel Air Hotel] H.No 224, Around Aware\n" +
                    "Phone : 00-251-11-1235538/39/40/ 41\n" +
                    "Email : bharat@ethionet.et",
            "Address : Mekanissa Road Higher 23 Kebele 13, House No. 1816\n" +
                    "Phone : (251-1) 712-104, 712-185\n" +
                    "Email : kbriadis@telecom.net.et",
            "Address : Kirkos Sub-city, Kebele 06 Sierra Leone St. (Debre Zeit road) House No. 021\n" +
                    "Phone : +251 (11) 466 5050\n" +
                    "Email : addisababaembassy@dfa.ie",
            "Address : Higher 16, Kebele 22 House no. 283, Addis Ababa\n" +
                    "Phone : +251-11- 646 09 99\n" +
                    "Email : embassy@addisababa.mfa.gov.il",
            "Address : Villa Italia - Kebenà, Addis Ababa\n" +
                    "Phone : 00251111235717, 1235685\n" +
                    "Email : ambasciata.addisabeba@esteri.it",
            "Address : House No.653, Kebele 7 Woreda 18, Addis Ababa\n" +
                    "Phone : +251-1-51-10-88 ",
            "kenya",
            "Address : Wereda 17 Kebele 23 H.2116/K, Addis Ababa\n" +
                    "Phone : +2511 612828/614368/9\n" +
                    "Email : mscaya@hotmail.com",
            "Address : Nafas Silk Sub-City Kebele, 05 House no 2629\n" +
                    "Phone : 251113710033\n" +
                    "Email : saloneembadd@yahoo.co.uk",
            "Address : Kefetagna 17, Kebele 19 House Nr. 629 Bole, Addis-Ababa\n" +
                    "Phone : 251 1 61 25 55\n" +
                    "Email : amba.mad.addis@telecom.net.et",
            "malawi",
            "Address : Addis Ababa\n" +
                    "Phone : (+251-11) 2712601\n" +
                    "Email : addismali.addis@telecom.net.com",
            "Address : Addis Ababa\n" +
                    "Phone : 002511615997\n" +
                    "Email : mmaddis@telecom.net.et",
            "Address : Shola Axion (to former Jacross Compound), Bole Kifle Ketema Kebele:14 House Number: New Block: B5/6\n" +
                    "Phone : (251-116) 479-333 ",
            "Address : Addis Ababa\n" +
                    "Phone : (+251-11) 5531700",
            "Address : Addis Ababa\n" +
                    "Phone : (+251-11) 3728622/3, 3718593\n" +
                    "Email : embamoc-add@ethionet.et",
            "Address : Bole Road W. 17, Kebel 19 House No. 002\n" +
                    "Phone : +251-1-611966 or 612055 ",
            "Address : W.9, K.23\n" +
                    "Phone : (+251-1) 651305, 550644 ",
            "Address : Addis Ababa\n" +
                    "Phone : (+251-11) 1550644 ",
            "Address : House No. 2038, Kebele 03, K.K. Bole, Addis Ababa\n" +
                    "Phone : (+251-11) -6188395, 6188293\n" +
                    "Email : parepadisababa@hotmail.com",
            "palestine",
            "Address : 'Dembel' City Centrer 8th Floor Bole Road\n" +
                    "Phone : +251.11.552.6899\n" +
                    "Email : embportaddis@gmail.com",
            "Address : Woreda 17, Kebele 19, Houses No. 0910, Bole Road\n" +
                    "Phone : (00) (251) (1) 610156\n" +
                    "Email : roembaddis@telecom.net.et",
            "Address : Yeka Kifle-Ketema, Kebele 08, Fikre-Mariam Street, Addis Ababa\n" +
                    "Phone : +2511 612-060, 611-828\n" +
                    "Email : russemb@telecom.net.et",
            "Address : Africa Avenue H-17K-20, Addis Ababa\n" +
                    "Phone : (+251-11) 6610300, 6610357, 6610387\n" +
                    "Email : ambaddis@minaffet.gov.rw",
            "Address : W15, K26, House No. 923\n" +
                    "Phone : 251113710033\n" +
                    "Email : saloneembadd@yahoo.co.uk",
            "Address : Nifasilk Lafto, Subcity Kebele 03 South Africa Street (Old Airport Area) Addis Ababa\n" +
                    "Phone : + 251 11 371 1002/ or + 251 11 371 1017 / or + 251\n" +
                    "Email : sa.embassy.addis@telecom.net.et",
            "Address : Entoto Av. Addis Ababa\n" +
                    "Phone : 55 02 22\n" +
                    "Email : ethiopia@ethiopianembassy.org",
            "Address : Addis Ababa\n" +
                    "Phone : +251-1-515-241\n" +
                    "Email : sudan.embassy@telecom.net.et",
            "Address : Lideta subcity Kebele 07/14, House No. 891\n" +
                    "Phone : +251 (11) 518 0000\n" +
                    "Email : ambassaden.addis.abeba@sida.se",
            "Address : Old Airport, W24, K13, Addis Ababa\n" +
                    "Phone : (+251-1) 711107, 710577, 711608\n" +
                    "Email : vertretung@add.rep.admin.ch",
            "Address : Addis Ababa\n" +
                    "Phone : (251-1) 511063, 612904, 518155",
            "Address : Addis Ababa\n" +
                    "Phone : +251 152-26-75 / +251 152-35-22",
            "Address : Africa Avenue, Woreda 17, Kebele 19, House No. 0008 100069\n" +
                    "Phone : +251-1-612063/+251-1-621-840/+251-1-621-841 ",
            "Address : Africa Avenue, W17, K19, House No. 018\n" +
                    "Phone : +251-1-612321 ",
            "Address : Kirkos Kifle Ketema, Kebele 35, H. No. 031\n" +
                    "Phone : +251-1-5513114 / +251-1-5513088\n" +
                    "Email : uganda.emb@telecom.net.et",
            "Address : Woreda 17, Kebele 23, House 2111\n" +
                    "Phone : +251-1-611698 ",
            "Address : Addis Ababa\n" +
                    "Phone : (+251-1) 711811 / 712204 / 710990 ",
            "Address : Addis Ababa\n" +
                    "Phone : (+251-11) 371 1302\n" +
                    "Email : zam.emb@ethionet.et",
            "Address : W17, k19, house No. 007, Addis Ababa\n" +
                    "Phone : (+251-1) 61 38 77 / 2\n" +
                    "Email : zimbabweembassy@telecom.net.et"
    };


    private Integer imageid[] = {
            R.drawable.algeria,
            R.drawable.angola,
            R.drawable.australia,
            R.drawable.belgium,
            R.drawable.botswana,
            R.drawable.brazil,
            R.drawable.canada,
            R.drawable.chiana,
            R.drawable.cuba,
            R.drawable.czech,
            R.drawable.djibouti,
            R.drawable.egypt,
            R.drawable.finland,
            R.drawable.france,
            R.drawable.gabon,
            R.drawable.german,
            R.drawable.ghana,
            R.drawable.greece,
            R.drawable.hungary,
            R.drawable.india,
            R.drawable.indonesia,
            R.drawable.iran,
            R.drawable.israel,
            R.drawable.italy,
            R.drawable.japan,
            R.drawable.kenya,
            R.drawable.kuwait,
            R.drawable.leone,
            R.drawable.madagascar,
            R.drawable.malawi,
            R.drawable.mali,
            R.drawable.mauritius,
            R.drawable.mexico,
            R.drawable.morocco,
            R.drawable.mozambique,
            R.drawable.namibia,
            R.drawable.niger,
            R.drawable.nigeria,
            R.drawable.pakkistan,
            R.drawable.palestine,
            R.drawable.portugal,
            R.drawable.rome,
            R.drawable.russia,
            R.drawable.rwanda,
            R.drawable.serbia,
            R.drawable.southafrica,
            R.drawable.spain,
            R.drawable.sudan,
            R.drawable.sweden,
            R.drawable.switzerland,
            R.drawable.tanzania,
            R.drawable.togo,
            R.drawable.tunisia,
            R.drawable.turkey,
            R.drawable.uganda,
            R.drawable.ukraine,
            R.drawable.yemen,
            R.drawable.zambia,
            R.drawable.zimbabwe,

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_embassy_main);

        EmbassyListView customList = new EmbassyListView(this, names, desc, imageid);

        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(customList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),names[i],Toast.LENGTH_SHORT).show();
            }
        });
    }




}
