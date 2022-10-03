package com.example.demo.servlet;

import com.example.demo.Entity.Island;
import com.example.demo.dao.DaoFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/populate")
public class PopulateDatabaseServlet extends HttpServlet {

    private static List<Island> islands = new ArrayList<Island>() {{
        Island moorea = new Island(
                1,
                "Moorea",
                "http://t1.gstatic.com/licensed-image?q=tbn:ANd9GcRZTnI79YTjGb4Co5qBZdh46_wmOtsXDL2RkMyDAUCJKXYC-huw7qKeT61F-fL7our1",
                134d,
                16192d,
                -17.533306,
                -149.8386601,
                "Polynésie française"
        );
        add(moorea);

        Island island2 = new Island(
                2,
                "Vieques",
                "https://www.bouger-voyager.com/wp-content/uploads/2016/01/baie-de-mosquito-640x380.jpg",
                135d,
                9350d,
                18.1262854,
                -65.4400985,
                "Porto Rico");
        add(island2);

        Island crete = new Island(3, "Crète", "https://www.poupadou.com/blog/wp-content/uploads/2018/10/Mpalos-plage-en-Cr%C3%A8te-scaled.jpg", 8450d, 621340d, 35.3084952, 24.4633423, "Grèce");
        add(crete);

        Island maui = new Island(
                4,
                "Maui",
                "http://t3.gstatic.com/licensed-image?q=tbn:ANd9GcQgrTB4xeUd96JEHVy1YWqEQo72SnRpfp06-3JaiJWvFMciOMvvrP28diG5-Ce2PQT6",
                1902d,
                144444d,
                20.8029568,
                -156.3106833,
                "USA");
        add(maui);

        Island tsushima = new Island(
                5L,
                "tsushima",
                "https://media.gettyimages.com/photos/aso-bay-tsushima-nagasaki-japan-picture-id109591602?s=2048x2048",
                696.26d,
                39716d,
                34.2053717,
                129.2946547,
                "japon"
        );
        add(tsushima);

        Island barbade = new Island(
                6L,
                "Barbade",
                "https://www.ou-et-quand.net/partir/images/illustration/barbade_408.jpg",
                430d,
                294560d,
                13.1500331,
                -59.5250305,
                "Barbade"
        );
        add(barbade);

        Island ileDeFrance = new Island(
                7L,
                "Ile de France",
                "https://www.usinenouvelle.com/mediatheque/0/7/5/000353570_896x598_c.jpg",
                12012d,
                12210000d,
                48.8499198,
                2.6370411,
                "France"
        );
        add(ileDeFrance);


        Island molokai = new Island(
                8L,
                "Molokai",
                "https://about.hawaiilife.com/wp-content/uploads/2018/03/62c8b451fed2d74668d6aba8eb3f579c5d5cb1bc51e09770c5a65b7681a9d32c.jpg",
                673d,
                7404d,
                21.1344895,
                -157.0071539,
                "Etats-Unis"
        );
        add(molokai);

        Island island9 = new Island(9L,
                "Sardaigne",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/Cala_Goloritze_o.jpg/1280px-Cala_Goloritze_o.jpg",
                24090d,
                1654796d,
                40.121310,
                9.010441, "Italie");
        add(island9);


        Island island10 = new Island(10,
                "île de Baffin",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4c/Baffin_Island_Northeast_Coast_1997-08-07.jpg/1280px-Baffin_Island_Northeast_Coast_1997-08-07.jpg",
                507451d,
                11000d,
                65.86558450066828,
                -71.1130507111078,
                "Canada");
        add(island10);

        Island palawan = new Island(
                11,
                "Palawan",
                "https://www.costacroisieres.fr/content/dam/costa/costa-magazine/articles-magazine/islands/most-beautiful-islands/10-palawan.jpg.image.1296.974.high.jpg",
                12189d,
                430000d,
                9.6481,
                118.732,
                "Philippines");
        add(palawan);

        Island island12 = new Island(
                12L,
                "Okinawa",
                "https://s3-ap-northeast-1.amazonaws.com/psh-ex-ftnikkei-3937bb4/images/6/8/2/0/40180286-3-eng-GB/Cropped-165138442620220501TKY%20Okinawa%20naminoue_shrine_23_lbvhey.jpg",
                1207d,
                1230000d,
                26.5707754,
                128.0255901,
                "Préfecture d'Okinawa, Japon"
        );
        add(island12);

        Island brehat = new Island(
                13L,
                "Bréhat",
                "https://www.bretagne.com/sites/default/files/post/Guide_pratique_ile_br%C3%A9hat_photo_Dominique_Douard.jpg",
                3d,
                378d,
                48.8461,
                -2.999,
                "France");
        add(brehat);

        Island gotland = new Island(14L,
                "Gotland",
                "https://www.worldatlas.com/r/w1200-q80/upload/68/f7/02/shutterstock-1468615610.jpg",
                3183.7d,
                58595d,
                57.30,
                18.30,
                "Sweden");
        add(gotland);

        Island djerba = new Island(
                16L,
                "Djerba",
                "https://nova-ott-images-tn.ssl.cdn.cra.cz/rx1920/a1929463-5b14-4066-876a-101360daec11",
                514d,
                163726d,
                33.48,
                10.51,
                "Tunisie"
        );
        add(djerba);

        Island malaMala = new Island(
                15L,
                "Mala Mala",
                "https://media.cntraveler.com/photos/59d4ea0c46f62157c95ac441/1:1/w_3386,h_3386,c_limit/21_Fiji_GettyImages-150956356.jpg",
                18274d,
                926276d,
                -17.713371,
                178.065033,
                "Fiji"
        );
        add(malaMala);
    }};

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        islands.forEach(island -> {
            DaoFactory.getIslandDAO().create(island);
        });
    }
}
