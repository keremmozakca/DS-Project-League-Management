
package com.mycompany.leaguemanagementproject;

public class SuperLeagueManagement {
    
    MQueue matchQueue = new MQueue();
    MStack matchResults = new MStack(310);
    MaxHeap leaderTable = new MaxHeap(20);
    
    Team[] teams;
    
    public SuperLeagueManagement(){
        // Galatasaray
        Team team1 = new Team("Galatasaray", "GS", 0);       

        team1.newPlayerProfile("Fernando Muslera", 1, "Goalkeeper", 81);  
        team1.newPlayerProfile("Elias Jelert", 24, "Right Back", 73);  
        team1.newPlayerProfile("Davinson Sánchez", 6, "Center Back", 80);  
        team1.newPlayerProfile("Victor Nelsson", 25, "Center Back", 78);  
        team1.newPlayerProfile("Ismail Jakobs", 4, "Left Back", 74);  
        team1.newPlayerProfile("Lucas Torreira", 34, "Defensive Midfield", 83);  
        team1.newPlayerProfile("Kerem Demirbay", 8, "Defensive Midfield", 78);  
        team1.newPlayerProfile("Hakim Ziyech", 22, "Right Wing", 80);  
        team1.newPlayerProfile("Dries Mertens", 10, "Attacking Midfield", 80);  
        team1.newPlayerProfile("Kerem Aktürkoğlu", 11, "Left Wing", 77);  
        team1.newPlayerProfile("Mauro Icardi", 9, "Striker", 83);  

        // Fenerbahçe
        Team team2 = new Team("Fenerbahçe", "FB", 0);       

        team2.newPlayerProfile("Dominik Livaković", 40, "Goalkeeper", 80);  
        team2.newPlayerProfile("Mert Müldür", 16, "Right Back", 74);  
        team2.newPlayerProfile("Çağlar Söyüncü", 4, "Center Back", 78);  
        team2.newPlayerProfile("Alexander Djiku", 6, "Center Back", 79);  
        team2.newPlayerProfile("Bright Osayi-Samuel", 21, "Left Back", 76);  
        team2.newPlayerProfile("İsmail Yüksek", 5, "Defensive Midfield", 77);  
        team2.newPlayerProfile("Mert Hakan Yandaş", 8, "Defensive Midfield", 71);  
        team2.newPlayerProfile("İrfan Can Kahveci", 17, "Right Wing", 79);  
        team2.newPlayerProfile("Dušan Tadić", 10, "Attacking Midfield", 83);  
        team2.newPlayerProfile("Filip Kostić", 18, "Left Wing", 82);  
        team2.newPlayerProfile("Edin Džeko", 9, "Striker", 82);  
        
        // Beşiktaş
        Team team3 = new Team("Beşiktaş", "BJK", 0);
       
        team3.newPlayerProfile("Mert Günok", 34, "Goalkeeper", 77);  
        team3.newPlayerProfile("Jonas Svensson", 2, "Right Back", 75);  
        team3.newPlayerProfile("Felix Uduokhai", 14, "Center Back", 75);  
        team3.newPlayerProfile("Gabriel Armando de Abreu", 3, "Center Back", 77);  
        team3.newPlayerProfile("Arthur Masuaku", 26, "Left Back", 76);  
        team3.newPlayerProfile("Almoatasembellah Ali Mohamed Al-Musrati", 6, "Defensive Midfield", 80);  
        team3.newPlayerProfile("Gedson Carvalho Fernandes", 83, "Defensive Midfield", 77);  
        team3.newPlayerProfile("Milot Rashica", 7, "Right Wing", 75);  
        team3.newPlayerProfile("Ciro Immobile", 9, "Attacking Midfield", 82);  
        team3.newPlayerProfile("Salih Uçan", 8, "Left Wing", 73);  
        team3.newPlayerProfile("Vincent Aboubakar", 11, "Striker", 77);  
        
        // Samsunspor
        
        Team team4 = new Team("Samsunspor", "SMS", 0);
        
        team4.newPlayerProfile("Okan Kocuk", 1, "Goalkeeper", 69);
        team4.newPlayerProfile("Zeki Yavru", 18, "Right Back", 64);
        team4.newPlayerProfile("Rick van Drongelen", 4, "Center Back", 70);
        team4.newPlayerProfile("Lubomir Satka", 37, "Center Back", 69);
        team4.newPlayerProfile("Marc Bola", 16, "Left Back", 67);
        team4.newPlayerProfile("Youssef Aït Bennasser", 6, "Defensive Midfield", 69);
        team4.newPlayerProfile("Olivier Ntcham", 8, "Defensive Midfield", 71);
        team4.newPlayerProfile("Carlo Holse", 21, "Right Wing", 70);
        team4.newPlayerProfile("Emre Kılınç", 10, "Attacking Midfield", 71);
        team4.newPlayerProfile("Arbnor Muja", 11, "Left Wing", 71);
        team4.newPlayerProfile("Moryké Fofana", 9, "Striker", 65);

        // Göztepe
        Team team5 = new Team("Göztepe", "GZT", 0);
        
        team5.newPlayerProfile("Mateusz Lis", 97, "Goalkeeper", 73);
        team5.newPlayerProfile("Nazım Sangaré", 30, "Right Back", 68);
        team5.newPlayerProfile("Héliton Jorge Tito dos Santos", 5, "Center Back", 71);
        team5.newPlayerProfile("Malcom Narcisse Bokele Mputu", 26, "Center Back", 69);
        team5.newPlayerProfile("Djalma Antonio da Silva Filho", 66, "Left Back", 68);
        team5.newPlayerProfile("Doğan Erdoğan", 21, "Defensive Midfield", 67);
        team5.newPlayerProfile("Ahmed Ildız", 8, "Defensive Midfield", 68);
        team5.newPlayerProfile("Kuryu Matsuki", 7, "Right Wing", 62);
        team5.newPlayerProfile("David Tijanić", 43, "Attacking Midfield", 68);
        team5.newPlayerProfile("Juan", 11, "Left Wing", 67);
        team5.newPlayerProfile("David Datro Fofana", 99, "Striker", 64);
        
        // Eyüpspor
        Team team6 = new Team("Eyüpspor", "EYS", 0);
        
        team6.newPlayerProfile("Berke Özer", 1, "Goalkeeper", 68);
        team6.newPlayerProfile("Léo Dubois", 15, "Right Back", 60);
        team6.newPlayerProfile("Luccas Claro dos Santos", 4, "Center Back", 50);
        team6.newPlayerProfile("Rúben Vezo", 14, "Center Back", 70);
        team6.newPlayerProfile("Caner Erkin", 88, "Left Back", 70);
        team6.newPlayerProfile("Robin Yalçın", 6, "Defensive Midfield", 67);
        team6.newPlayerProfile("Fredrik Midtsjø", 18, "Defensive Midfield", 73);
        team6.newPlayerProfile("Sinan Gümüş", 11, "Right Wing", 63);
        team6.newPlayerProfile("Samu Saiz", 10, "Attacking Midfield", 74);
        team6.newPlayerProfile("Halil Akbunar", 7, "Left Wing", 71);
        team6.newPlayerProfile("Gianni Bruno", 99, "Striker", 72);

        // Başakşehir
        Team team7 = new Team("Başakşehir", "BSKS", 0);
        
        team7.newPlayerProfile("Volkan Babacan", 1, "Goalkeeper", 70);
        team7.newPlayerProfile("Ömer Ali Şahiner", 42, "Right Back", 68);
        team7.newPlayerProfile("Léo Duarte", 5, "Center Back", 75);
        team7.newPlayerProfile("Jerome Opoku", 3, "Center Back", 71);
        team7.newPlayerProfile("Lucas Lima", 6, "Left Back", 71);
        team7.newPlayerProfile("Berat Özdemir", 2, "Defensive Midfield", 72);
        team7.newPlayerProfile("Berkay Özcan", 10, "Defensive Midfield", 72);
        team7.newPlayerProfile("Deniz Türüç", 23, "Right Wing", 73);
        team7.newPlayerProfile("Serdar Gürler", 7, "Attacking Midfield", 72);
        team7.newPlayerProfile("Patryk Szysz", 18, "Left Wing", 68);
        team7.newPlayerProfile("Krzysztof Piątek", 9, "Striker", 74);
        
        // Gaziantep FK
        Team team8 = new Team("Gaziantep FK", "GFK", 0);
        
        team8.newPlayerProfile("Sokratis Dioudis", 1, "Goalkeeper", 70);
        team8.newPlayerProfile("Deian Sorescu", 2, "Right Back", 69);
        team8.newPlayerProfile("Ertuğrul Ersoy", 3, "Center Back", 65);
        team8.newPlayerProfile("Arda Kızıldağ", 4, "Center Back", 67);
        team8.newPlayerProfile("Saborit", 5, "Left Back", 70);
        team8.newPlayerProfile("Cyril Mandouki", 6, "Defensive Midfield", 68);
        team8.newPlayerProfile("Furkan Soyalp", 7, "Defensive Midfield", 68);
        team8.newPlayerProfile("Kacper Kozłowski", 8, "Central Midfield", 68);
        team8.newPlayerProfile("Alexandru Maxim", 9, "Attacking Midfield", 75);
        team8.newPlayerProfile("David Okereke", 10, "Right Wing", 74);
        team8.newPlayerProfile("Kenan Kodro", 11, "Striker", 72);

        // Antalyaspor
        Team team9 = new Team("Antalyaspor", "ANS", 0);
        
        team9.newPlayerProfile("Ataberk Dadakdeniz", 1, "Goalkeeper", 66);
        team9.newPlayerProfile("Veysel Sarı", 4, "Right Back", 67);
        team9.newPlayerProfile("Bahadır Öztürk", 13, "Center Back", 65);
        team9.newPlayerProfile("Emrecan Uzunhan", 6, "Center Back", 62);
        team9.newPlayerProfile("Güray Vural", 22, "Left Back", 70);
        team9.newPlayerProfile("Jakub Kałuziński", 11, "Defensive Midfield", 65);
        team9.newPlayerProfile("Erdal Rakip", 19, "Defensive Midfield", 69);
        team9.newPlayerProfile("Abdullah Yiğiter", 8, "Right Wing", 65);
        team9.newPlayerProfile("Sander van de Streek", 10, "Attacking Midfield", 69);
        team9.newPlayerProfile("Emre Uzun", 9, "Striker", 55);
        team9.newPlayerProfile("Mert Yılmaz", 7, "Left Wing", 63);
        
        // Konyaspor
        Team team10 = new Team("Konyaspor", "KS", 0);
        
        team10.newPlayerProfile("İbrahim Sehic", 13, "Goalkeeper", 70);
        team10.newPlayerProfile("Ahmet Oğuz", 89, "Right Back", 68);
        team10.newPlayerProfile("Adil Demirbağ", 4, "Center Back", 66);
        team10.newPlayerProfile("Francesco Moutinho", 23, "Center Back", 68);
        team10.newPlayerProfile("Guilherme Haubert", 6, "Left Back", 69);
        team10.newPlayerProfile("Amir Hadziahmetovic", 18, "Defensive Midfield", 71);
        team10.newPlayerProfile("Endri Çekiçi", 10, "Defensive Midfield", 70);
        team10.newPlayerProfile("Konrad Michalak", 77, "Right Wing", 69);
        team10.newPlayerProfile("Zymer Bytyqi", 7, "Attacking Midfield", 71);
        team10.newPlayerProfile("Sokol Cikalleshi", 9, "Striker", 70);
        team10.newPlayerProfile("Serdar Gürler", 17, "Left Wing", 71);
        
        // Rizespor
        Team team11 = new Team("Rizespor", "RS", 0);
        
        team11.newPlayerProfile("Tarık Çetin", 1, "Goalkeeper", 68);
        team11.newPlayerProfile("Husniddin Alikulov", 2, "Center Back", 70);
        team11.newPlayerProfile("Halil İbrahim Pehlivan", 3, "Center Back", 69);
        team11.newPlayerProfile("Attila Mocsi", 4, "Center Back", 71);
        team11.newPlayerProfile("Casper Højer Nielsen", 5, "Right Back", 72);
        team11.newPlayerProfile("Yannis Papanikolaou", 6, "Attacking Midfield", 74);
        team11.newPlayerProfile("Benhur Keser", 7, "Attacking Midfield", 71);
        team11.newPlayerProfile("Dal Varešanović", 8, "Attacking Midfield", 73);
        team11.newPlayerProfile("Ali Sowe", 9, "Striker", 75);
        team11.newPlayerProfile("Ibrahim Olawoyin", 10, "Right Wing", 72);
        team11.newPlayerProfile("Václav Jurečka", 11, "Striker", 74);
        
        // Trabzonspor
        Team team12 = new Team("Trabzonspor", "TS", 0);
        
        team12.newPlayerProfile("Stefan Savić", 4, "Center Back", 81);
        team12.newPlayerProfile("Vitor Hugo", 6, "Center Back", 74);
        team12.newPlayerProfile("Uğurcan Çakır", 1, "Goalkeeper", 77);
        team12.newPlayerProfile("Casper Højer Nielsen", 2, "Right Back", 72);
        team12.newPlayerProfile("Halil İbrahim Pehlivan", 3, "Left Back", 69);
        team12.newPlayerProfile("Enis Bardhi", 8, "Attacking Midfield", 76);
        team12.newPlayerProfile("Ozan Tufan", 10, "Defensive Midfield", 75);
        team12.newPlayerProfile("Abdülkadir Ömür", 7, "Right Wing", 74);
        team12.newPlayerProfile("Trezeguet", 11, "Left Wing", 74);
        team12.newPlayerProfile("Simon Banza", 9, "Striker", 80);
        team12.newPlayerProfile("Anthony Nwakaeme", 77, "Striker", 76);
        
        // Kasımpaşa
        Team team13 = new Team("Kasımpaşa", "KSP", 0);
        
        team13.newPlayerProfile("Andreas Gianniotis", 1, "Goalkeeper", 74);
        team13.newPlayerProfile("Cláudio Winck", 2, "Right Back", 72);
        team13.newPlayerProfile("Kenneth Omeruo", 3, "Center Back", 74);
        team13.newPlayerProfile("Sadık Çiftpınar", 4, "Center Back", 73);
        team13.newPlayerProfile("Gökhan Gül", 5, "Left Back", 71);
        team13.newPlayerProfile("Haris Hajradinović", 6, "Defensive Midfield", 74);
        team13.newPlayerProfile("Mamadou Fall", 7, "Defensive Midfield", 71);
        team13.newPlayerProfile("Carlos Miguel Dias", 8, "Right Wing", 71);
        team13.newPlayerProfile("Josip Brekalo", 9, "Attacking Midfield", 76);
        team13.newPlayerProfile("Erdem Çetinkaya", 10, "Striker", 71);
        team13.newPlayerProfile("Murtaza bin Yunus", 11, "Left Wing", 71);

        // Sivasspor
        Team team14 = new Team("Sivasspor", "SVS", 0);

        team14.newPlayerProfile("Ali Şaşal Vural", 35, "Goalkeeper", 69);
        team14.newPlayerProfile("Uğur Çiftçi", 3, "Left Back", 64);
        team14.newPlayerProfile("Achilleas Poungouras", 44, "Center Back", 65);
        team14.newPlayerProfile("Noah Sonko Sundberg", 27, "Center Back", 66);
        team14.newPlayerProfile("Ziya Erdal", 58, "Left Back", 63);
        team14.newPlayerProfile("Murat Paluli", 7, "Right Back", 64);
        team14.newPlayerProfile("Samba Camara", 14, "Defensive Midfield", 65);
        team14.newPlayerProfile("Emrah Başsan", 17, "Attacking Midfield", 66);
        team14.newPlayerProfile("Garry Rodrigues", 24, "Right Wing", 68);
        team14.newPlayerProfile("Rey Manaj", 9, "Striker", 70);
        team14.newPlayerProfile("Alex Pritchard", 10, "Left Wing", 67);

        // Kayserispor
        Team team15 = new Team("Kayserispor", "KYS", 0);
        
        team15.newPlayerProfile("Carlos Mané", 20, "Right Wing", 72);
        team15.newPlayerProfile("Aylton Boa Morte", 70, "Striker", 71);
        team15.newPlayerProfile("Miguel Cardoso", 10, "Attacking Midfield", 70);
        team15.newPlayerProfile("Eray Özbek", 16, "Central Midfield", 68);
        team15.newPlayerProfile("Baran Ali Gezek", 26, "Central Midfield", 67);
        team15.newPlayerProfile("Hasan Ali Kaldırım", 33, "Left Back", 69);
        team15.newPlayerProfile("Lionel Carole", 23, "Center Back", 68);
        team15.newPlayerProfile("Arif Kocaman", 54, "Center Back", 67);
        team15.newPlayerProfile("Majid Hosseini", 5, "Center Back", 69);
        team15.newPlayerProfile("Onurcan Piri", 1, "Goalkeeper", 65);
        team15.newPlayerProfile("Şamil Öztürk", 39, "Goalkeeper", 64);

        // Bodrumspor
        Team team16 = new Team("Bodrumspor", "BS", 0);
        
        team16.newPlayerProfile("Diogo Sousa", 1, "Goalkeeper", 66);
        team16.newPlayerProfile("Zdravko Dimitrov", 7, "Right Back", 65);
        team16.newPlayerProfile("Christophe Hérelle", 29, "Center Back", 72);
        team16.newPlayerProfile("Ondřej Čelůstka", 3, "Center Back", 71);
        team16.newPlayerProfile("Ali Eren İyican", 5, "Left Back", 64);
        team16.newPlayerProfile("Pedro Brazão", 20, "Right Midfield", 67);
        team16.newPlayerProfile("Samet Yalçın", 8, "Central Midfield", 65);
        team16.newPlayerProfile("Omar Imeri", 11, "Attacking Midfield", 68);
        team16.newPlayerProfile("Gökdeniz Bayrakdar", 41, "Left Midfield", 68);
        team16.newPlayerProfile("George Pușcaș", 9, "Striker", 70);
        team16.newPlayerProfile("Haki Osman", 19, "Striker", 66);

        // Hatayspor
        Team team17 = new Team("Hatayspor", "HS", 0);
        
        team17.newPlayerProfile("Erce Kardeşler", 1, "Goalkeeper", 71);
        team17.newPlayerProfile("Kamil Ahmet Çörekçi", 2, "Right Back", 67);
        team17.newPlayerProfile("Guy-Marcelin Kilama", 3, "Center Back", 67);
        team17.newPlayerProfile("Francisco Javier Calvo Quesada", 4, "Center Back", 68);
        team17.newPlayerProfile("Cemali Sertel", 88, "Left Back", 67);
        team17.newPlayerProfile("Kerim Alıcı", 22, "Right Midfield", 67);
        team17.newPlayerProfile("Ali Yıldız", 25, "Central Midfield", 66);
        team17.newPlayerProfile("Oğuzhan Matur", 31, "Central Midfield", 65);
        team17.newPlayerProfile("Bilal Boutobba", 98, "Left Midfield", 68);
        team17.newPlayerProfile("Vincent Aboubakar", 9, "Striker", 71);
        team17.newPlayerProfile("Joelson Fernandes", 77, "Right Wing", 66);
        
        // Adana Demirspor
        Team team18 = new Team("Adana Demirspor", "ADS", 0);
        
        team18.newPlayerProfile("Yusuf Sarı", 7, "Right Wing", 75);
        team18.newPlayerProfile("Nabil Alioui", 10, "Attacking Midfield", 70);
        team18.newPlayerProfile("Tayfun Aydoğan", 8, "Central Midfield", 68);
        team18.newPlayerProfile("Semih Güler", 4, "Center Back", 68);
        team18.newPlayerProfile("Andreaw Gravillon", 5, "Center Back", 72);
        team18.newPlayerProfile("Jovan Manev", 15, "Center Back", 63);
        team18.newPlayerProfile("Abdulsamet Burak", 23, "Center Back", 60);
        team18.newPlayerProfile("Bünyamin Balat", 21, "Right Midfield", 65);
        team18.newPlayerProfile("Aksel Aktaş", 22, "Central Midfield", 65);
        team18.newPlayerProfile("Yusuf Barası", 16, "Goalkeeper", 65);
        team18.newPlayerProfile("Abat Ayımbetov", 17, "Striker", 65);
        
        // Advantage Declaring
        double sum = 0;
        teams = new Team[]{team1, team2, team3, team4, team5, team6, team7, 
                        team8, team9, team10, team11, team12, team13, team14,
                        team15, team16, team17, team18};       
        for(Team team: teams){
            double t = teamAdvantageAlgorithm(team);
            sum += t;
        }
        double average = (sum / 18);
        
        for(Team team: teams){
            team.advantage = (int)((teamAdvantageAlgorithm(team) - average) * 10);
        }
        
        //Match m = new Match(team10, team2);
        //m.playMatch();
        scheduleMatch(teams);
    }
    
    public double teamAdvantageAlgorithm(Team team){
        final double goalkeeperWeight = 1.5;
        final double backWeight = 1.1;
        final double midfieldWingWeight = 1.0;
        final double strikerWeight = 1.2;
        
        double totalPoint = 0;
        Player player = team.teamPlayers.head;
        while(player != null){
            switch(player.position){
                case "Goalkeeper" -> totalPoint += (player.value * goalkeeperWeight);
                case "Right Back" -> totalPoint += (player.value * backWeight);
                case "Left Back" -> totalPoint += (player.value * backWeight);
                case "Center Back" -> totalPoint += (player.value * backWeight);
                case "Defensive Midfield" -> totalPoint += (player.value * midfieldWingWeight);
                case "Attacking Midfield" -> totalPoint += (player.value * midfieldWingWeight);
                case "Central Midfield" -> totalPoint += (player.value * midfieldWingWeight);
                case "Right Wing" -> totalPoint += (player.value * midfieldWingWeight);
                case "Left Wing" -> totalPoint += (player.value * midfieldWingWeight);
                case "Striker" -> totalPoint += (player.value * strikerWeight);
                default -> {
                    totalPoint += (player.value * midfieldWingWeight);
                }                   
            }
            player = player.nextPlayer;
        }           
        return (totalPoint / 11);
    }

    public void scheduleMatch(Team[] teams){
        Team[] newTeams = shuffle(teams);
        Team[] newTeamsCopy = newTeams.clone();
        Team[] homeTeams = new Team[9];
        Team[] awayTeams = new Team[9]; 
        
        // FIRST PART
        homeAwaySeperate(newTeams, homeTeams, awayTeams);
        planWeek(homeTeams, awayTeams);
        for(int i = 0;i < newTeams.length -2; i++){
            Team temp = newTeams[newTeams.length - 1];
            for(int j = newTeams.length - 1;j > 0; j--){
                newTeams[j] = newTeams[(j-1)];
            }
            newTeams[1] = temp;
            homeAwaySeperate(newTeams, homeTeams, awayTeams);
            planWeek(homeTeams, awayTeams);
        }
        
        // SECOND PART
        
        newTeams = reverseArr(newTeamsCopy);
        homeAwaySeperate(newTeams, homeTeams, awayTeams);
        planWeek(homeTeams, awayTeams);

        for (int i = 1; i < newTeams.length - 1; i++) { 
            Team temp = newTeams[1];  
            for (int j = 1; j < newTeams.length - 1; j++) { 
                newTeams[j] = newTeams[j + 1]; 
            }
            newTeams[newTeams.length - 1] = temp; 
            homeAwaySeperate(newTeams, homeTeams, awayTeams);
            planWeek(homeTeams, awayTeams);
        }
        //return matchQueue;
    }
    
    public void PlayNextMatch(){
        Match currentMatch = matchQueue.dequeue();
        currentMatch.playMatch();
        matchResults.push(currentMatch.result);
    }
    
    public void showLeaderTable(){
        createPoints(teams);
        
        for(Team t: teams){
            leaderTable.insert(t);
        }
        while(leaderTable.currentSize >= 0){
            Team team = leaderTable.extractMax();
            System.out.println(team);
        }
    }
    
    private void createPoints(Team[] teams){
        for(Team t: teams){
            t.totalPoint = 0;
            t.goalDiff = 0;
        }
        MStack results = new MStack(310);
        results.matchResults = this.matchResults.matchResults.clone();
        results.top = this.matchResults.top;              
        while(!results.isEmpty()){
            MatchResult mResult = matchResults.pop();
            if(mResult.winner == null){
                mResult.homeT.totalPoint++;
                mResult.awayT.totalPoint++;
            }else{
                mResult.winner.totalPoint += 3;
                mResult.winner.goalDiff += (mResult.goalDiff);
            }
        }
    }
    
    private Team[] reverseArr(Team[] tArr){
        Team[] reversedArray = new Team[tArr.length];
        int j = 0;
        for(int i = tArr.length - 1; i > -1; i--){
            reversedArray[j] = tArr[i];
            j++;
        }
        return reversedArray;       
    }
    
    private void planWeek(Team[] home, Team[] away){
        for(int i = 0; i < home.length; i++){
            matchQueue.enqueue(home[i], away[i]);
        }
    }
      
    private void homeAwaySeperate(Team[] teams, Team[] homeTeams, Team[] awayTeams){
        int j = 0;
        for(int i = 0;i < teams.length;i++){
            if(i < (teams.length / 2)){
                homeTeams[i] = teams[i];
            }else{
                awayTeams[i % awayTeams.length] = teams[teams.length - 1 - j];
                j++;                       
            }
        }
    }
    
    public void printArr(Team[] ta){
        for(int i = 0; i < ta.length; i++){
            System.out.print(ta[i].teamName + " ");
        }
        System.out.println("");
    }
    
    public boolean control(int n, int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                return false;
            }
        }
        return true;
    }
    
    public Team[] shuffle(Team[] teamArray){        
        for (int i = 0; i < teamArray.length - 1; i++) {
            int j = (int)(Math.random() * teamArray.length);

            Team temp = teamArray[i];
            teamArray[i] = teamArray[j]; 
            teamArray[j] = temp;
        }
        return teamArray;
    }
    
}
