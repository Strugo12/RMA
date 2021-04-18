package com.example.famousathletes;

public class HallOfFame {
    private String MessiInfo, MaradonaInfo, RonaldoInfo;

    public HallOfFame() {
        MessiInfo = " Lionel Andrés Messi[note 1] (Spanish pronunciation: [ljoˈnel anˈdɾes ˈmesi] (About this soundlisten);[A] born 24 June 1987) is an Argentine professional footballer who plays as a forward and captains both Spanish club Barcelona and the Argentina national team. Often considered as the best player in the world and widely regarded as one of the greatest players of all time, Messi has won a record six Ballon d'Or awards,[note 2] a record six European Golden Shoes, and in 2020 was named to the Ballon d'Or Dream Team. He has spent his entire professional career with Barcelona, where he has won a club-record 35 trophies, including ten La Liga titles, seven Copa del Rey titles and four UEFA Champions Leagues. ";
        MaradonaInfo = "Diego Armando Maradona (Spanish: [ˈdjeɣo maɾaˈðona]; 30 October 1960 – 25 November 2020) was an Argentine professional football player and manager. Widely regarded as one of the greatest players in the history of the sport, he was one of the two joint winners of the FIFA Player of the 20th Century award. Maradona's vision, passing, ball control, and dribbling skills were combined with his small stature, which gave him a low centre of gravity allowing him to manoeuvre better than most other players. His presence and leadership on the field had a great effect on his team's general performance, while he would often be singled out by the opposition. In addition to his creative abilities, he possessed an eye for goal and was known to be a free kick specialist. A precocious talent, Maradona was given the nickname \"El Pibe de Oro\" (\"The Golden Boy\"), a name that stuck with him throughout his career. He also had a troubled off-field life and was banned in both 1991 and 1994 for abusing drugs.";
        RonaldoInfo = "Cristiano Ronaldo dos Santos Aveiro GOIH ComM (Portuguese pronunciation: [kɾiʃˈtjɐnu ʁɔˈnaɫdu]; born 5 February 1985) is a Portuguese professional footballer who plays as a forward for Serie A club Juventus and captains the Portugal national team. Often considered the best player in the world and widely regarded as one of the greatest players of all time, Ronaldo has won five Ballon d'Or awards[note 3] and four European Golden Shoes, both of which are records for a European player.";
    }

    public String getMessiInfo() {
        return MessiInfo;
    }

    public String getMaradonaInfo() {
        return MaradonaInfo;
    }

    public String getRonaldoInfo() {
        return RonaldoInfo;
    }

    public void setMessiInfo(String messiInfo) {
        MessiInfo = messiInfo;
    }

    public void setMaradonaInfo(String maradonaInfo) {
        MaradonaInfo = maradonaInfo;
    }

    public void setRonaldoInfo(String ronaldoInfo) {
        RonaldoInfo = ronaldoInfo;
    }
}
