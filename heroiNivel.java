public class heroiNivel {

    public static void main(String[] args) {
        String nome = "Danilo";
        int xp = 9844;

        String nivel;

        if (xp < 1000) {

            nivel = "Ferro";
        } else if (xp >= 1001 && xp <= 2000) {

            nivel = "Bronze";
        } else if (xp >= 2001 && xp <= 5000) {

            nivel = "Prata";
        } else if (xp >= 6001 && xp <= 7000) {

            nivel = "Ouro";
        } else if (xp >= 7001 && xp <= 8000) {

            nivel = "Platina";
        } else if (xp >= 8001 && xp <= 9000) {

            nivel = "Ascedente";
        } else if (xp >= 9001 && xp <= 10000) {

            nivel = "Imortal";
        } else {

            nivel = "Radiante";
        }

        System.out.println("O herói de nome " + nome + " está  np nivel de " + nivel);

        
        
    
}

}