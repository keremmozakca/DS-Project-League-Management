
package com.mycompany.leaguemanagementproject;

public class SuperLeagueManagement {
    
    public SuperLeagueManagement(){
        // Galatasaray
        Team team1 = new Team("Galatasaray", 0, 0);       

        team1.newPlayerProfile("Fernando Muslera", 1, "Goalkeeper", 0);  
        team1.newPlayerProfile("Elias Jelert", 24, "Right Back", 0);  
        team1.newPlayerProfile("Davinson Sánchez", 6, "Center Back", 0);  
        team1.newPlayerProfile("Victor Nelsson", 25, "Center Back", 0);  
        team1.newPlayerProfile("Ismail Jakobs", 4, "Left Back", 0);  
        team1.newPlayerProfile("Lucas Torreira", 34, "Defensive Midfield", 0);  
        team1.newPlayerProfile("Kerem Demirbay", 8, "Defensive Midfield", 0);  
        team1.newPlayerProfile("Hakim Ziyech", 22, "Right Wing", 0);  
        team1.newPlayerProfile("Dries Mertens", 10, "Attacking Midfield", 0);  
        team1.newPlayerProfile("Kerem Aktürkoğlu", 11, "Left Wing", 0);  
        team1.newPlayerProfile("Mauro Icardi", 9, "Striker", 0);  

        // Fenerbahçe
        Team team2 = new Team("Fenerbahçe", 1, 0);       

        team2.newPlayerProfile("Dominik Livaković", 40, "Goalkeeper", 0);  
        team2.newPlayerProfile("Mert Müldür", 16, "Right Back", 0);  
        team2.newPlayerProfile("Çağlar Söyüncü", 4, "Center Back", 0);  
        team2.newPlayerProfile("Alexander Djiku", 6, "Center Back", 0);  
        team2.newPlayerProfile("Bright Osayi-Samuel", 21, "Left Back", 0);  
        team2.newPlayerProfile("İsmail Yüksek", 5, "Defensive Midfield", 0);  
        team2.newPlayerProfile("Mert Hakan Yandaş", 8, "Defensive Midfield", 0);  
        team2.newPlayerProfile("İrfan Can Kahveci", 17, "Right Wing", 0);  
        team2.newPlayerProfile("Dušan Tadić", 10, "Attacking Midfield", 0);  
        team2.newPlayerProfile("Filip Kostić", 18, "Left Wing", 0);  
        team2.newPlayerProfile("Edin Džeko", 9, "Striker", 0);  
        
        // Beşiktaş
        Team team3 = new Team("Beşiktaş", 2, 0);
       
        team3.newPlayerProfile("Mert Günok", 34, "Goalkeeper", 0);  
        team3.newPlayerProfile("Jonas Svensson", 2, "Right Back", 0);  
        team3.newPlayerProfile("Felix Uduokhai", 14, "Center Back", 0);  
        team3.newPlayerProfile("Gabriel Armando de Abreu", 3, "Center Back", 0);  
        team3.newPlayerProfile("Arthur Masuaku", 26, "Left Back", 0);  
        team3.newPlayerProfile("Almoatasembellah Ali Mohamed Al-Musrati", 6, "Defensive Midfield", 0);  
        team3.newPlayerProfile("Gedson Carvalho Fernandes", 83, "Defensive Midfield", 0);  
        team3.newPlayerProfile("Milot Rashica", 7, "Right Wing", 0);  
        team3.newPlayerProfile("Ciro Immobile", 9, "Attacking Midfield", 0);  
        team3.newPlayerProfile("Salih Uçan", 8, "Left Wing", 0);  
        team3.newPlayerProfile("Vincent Aboubakar", 11, "Striker", 0);  
        
        // Samsunspor
        
        Team team4 = new Team("Samsunspor", 3, 0);
        
        team4.newPlayerProfile("Metin Aktaş", 1, "Goalkeeper", 0);
        team4.newPlayerProfile("Samet Çalık", 2, "Right Back", 0);
        team4.newPlayerProfile("Alperen Uysal", 3, "Center Back", 0);
        team4.newPlayerProfile("Nihat Akpınar", 5, "Center Back", 0);
        team4.newPlayerProfile("Kadir Keleş", 6, "Left Back", 0);
        team4.newPlayerProfile("Okan Derici", 7, "Defensive Midfield", 0);
        team4.newPlayerProfile("Emre Güral", 8, "Defensive Midfield", 0);
        team4.newPlayerProfile("Abdülkadir Parmak", 10, "Right Wing", 0);
        team4.newPlayerProfile("Kenan Karaman", 9, "Attacking Midfield", 0);
        team4.newPlayerProfile("Ömer Erdoğan", 11, "Left Wing", 0);
        team4.newPlayerProfile("Muhammet Beşir", 19, "Striker", 0);

        // Göztepe
        Team team5 = new Team("Göztepe", 4, 0);
        
        team5.newPlayerProfile("İsmail Koyuncu", 1, "Goalkeeper", 0);
        team5.newPlayerProfile("Fatih Aksoy", 2, "Right Back", 0);
        team5.newPlayerProfile("Emre Belözoğlu", 3, "Center Back", 0);
        team5.newPlayerProfile("Mehmet Eren Kılıç", 4, "Center Back", 0);
        team5.newPlayerProfile("Semih Kaya", 5, "Left Back", 0);
        team5.newPlayerProfile("Alper Potuk", 6, "Defensive Midfield", 0);
        team5.newPlayerProfile("Kerem Şeras", 7, "Defensive Midfield", 0);
        team5.newPlayerProfile("Canberk Özdemir", 10, "Right Wing", 0);
        team5.newPlayerProfile("Abdullah Durak", 9, "Attacking Midfield", 0);
        team5.newPlayerProfile("Emre Akbaba", 11, "Left Wing", 0);
        team5.newPlayerProfile("Hakan Aslan", 18, "Striker", 0);
        
        // Eyüpspor
        Team team6 = new Team("Eyüpspor", 5, 0);
        
        team6.newPlayerProfile("Kaan Vardar", 1, "Goalkeeper", 0);
        team6.newPlayerProfile("Barış Alıcı", 2, "Right Back", 0);
        team6.newPlayerProfile("Samet Gökgöz", 3, "Center Back", 0);
        team6.newPlayerProfile("Sinan Gümüş", 4, "Center Back", 0);
        team6.newPlayerProfile("Abdurrahman Gül", 5, "Left Back", 0);
        team6.newPlayerProfile("Uğur Demirok", 6, "Defensive Midfield", 0);
        team6.newPlayerProfile("Veli Kavlak", 7, "Defensive Midfield", 0);
        team6.newPlayerProfile("Serdar Gürler", 10, "Right Wing", 0);
        team6.newPlayerProfile("Hakan Çinemre", 9, "Attacking Midfield", 0);
        team6.newPlayerProfile("Murat Dönmez", 11, "Left Wing", 0);
        team6.newPlayerProfile("Bülent Korkmaz", 19, "Striker", 0);

        
    }
}
