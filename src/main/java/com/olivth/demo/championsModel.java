package com.olivth.demo;

import jakarta.persistence.*;
@Entity
@Table(name = "tb-tabela-de-campeoes")
public class championsModel {
        private String name;
        private String lane;
        private String type;

         @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        public championsModel(){}
            public championsModel(String name,String lane, String type){
            this.name=name;
            this.lane=lane;
            this.type=type;

            }
            String getName(){
            return name;
            }
            public void setName(){
            this.name=name;
            }
            String getLane(){
            return lane;
            }
            public void setLane(){
            this.lane=lane;
            }
            String getType(){
            return type;
            }
            public void setType(){
            this.type=type;
            }

}
