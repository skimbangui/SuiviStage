package com.example.suivistage;

public class Professeur {

        protected String id;
        protected String nom;
        protected String prenom;
        protected String email;
        protected String tel;


        //constructeur paramétré
        public Professeur (String id, String nom, String prenom, String email, String tel){
            super();
            this.id=id;
            this.nom=nom;
            this.prenom=prenom;
            this.email=email;
            this.tel=tel;
        }


        //Les accesseurs et les mutateurs
        public String getId(){
            return id;
        }
        public void setId(String id){
            this.id=id;
        }

        public String getNom() {
            return nom;
        }
        public void setNom(String nom) {
            this.nom=nom;
        }

        public String getPrenom(){
            return prenom;
        }
        public void setPrenom(String prenom){
            this.prenom=prenom;
        }

        public String getEmail(){
            return email;
        }
        public void setEmail(String email){
            this.email=email;
        }

        public String getTel(){
            return tel;
        }
        public void setTel(String tel){
            this.tel=tel;
        }
}
