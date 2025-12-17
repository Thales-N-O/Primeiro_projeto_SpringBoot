package com.olivth.demo;

import jakarta.persistence.*;
@Entity
@Table(name = "tb_tabela_de_campeoes")
public class ChampionsModel {
        private String name;
        private String lane;
        private String type;

         @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
//            DECLARAÇÃO
            private ChampionsModel(String name,String lane, String type){
            this.name=name;
            this.lane=lane;
            this.type=type;
            }
//            GETTERS & SETTERS
        //    --------------------------------------------
            String getName(String name){return name;}
            public void setName(){this.name=name;}
        //    --------------------------------------------
            String getLane(String lane){return lane;}
            public void setLane(){this.lane=lane;}
        //    --------------------------------------------

            String getType(String type){return type;}
            public void setType(){this.type=type;}
        //    --------------------------------------------
}
