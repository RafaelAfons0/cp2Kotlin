package br.com.fiap.movies

data class Movies(

    val name: String,
    val sinopsys: String,
    val partentalRating: String,
    val genre: String,
    val duration: String,
    val inTheaters: Boolean )

class ListaDeFilmes {
    companion object {
        val ListaDeFilmes = listOf(
            Movies(
                "Guardians of the Galaxy Vol. 3",
                "Still reeling from the loss of Gamora, Peter Quill must rally " +
                        "his team to defend the universe and protect one of their " +
                        "own. If the mission is not completely successful, it could" +
                        "possibly lead to the end of the Guardians as we know them.",
                "12",
                "Adventure/Sci-fi",
                "2h 29m",
                true
            ),
            Movies(
                "The Super Mario Bros. Movie",
                "With help from Princess Peach, Mario gets ready to square" +
                        "off against the all-powerful Bowser to stop his plans from" +
                        "conquering the world.",
                "L",
                "Adventure/Fantasy",
                "1h 32m",
                true
            ),
            Movies(
                "Knights of the Zodiac",
                "When a headstrong street orphan unwittingly taps into" +
                        "hidden powers, he discovers he might be the only person" +
                        "alive who can protect a reincarnated goddess who was sent" +
                        "to watch over humanity.",
                "12",
                "Action/Adventure",
                "1h 52m",
                true
            ),
            Movies(
                "Evil Dead Rise",
                "A reunion between two estranged sisters gets cut short by the rise of" +
                        "flesh-possessing demons, thrusting them into a primal battle" +
                        "for survival as they face the most nightmarish version of family imaginable.",
                "18",
                "Horror/Fantasy",
                "2h",
                true
            ),
            Movies(
                "Dungeons & Dragons: Honour Among Thieves",
                "A charming thief and a band of unlikely adventurers embark" +
                        "on an epic quest to retrieve a long lost relic, but their" +
                        "charming adventure goes dangerously awry when they run" +
                        "afoul of the wrong people.",
                "12",
                "Adventure/Fantasy",
                "2h 14m",
                true
            ),
            Movies(
                "Renfield",
                "Renfield, the tortured aide to his narcissistic boss, Dracula, is" +
                        "forced to procure his master's prey and do his every bidding." +
                        "However, after centuries of servitude, he's ready to see if there's a" +
                        "life outside the shadow of the Prince of Darkness.",
                "18",
                "Horror/Comedy",
                "1h 35m",
                true
            ),
            Movies(
                "Left Behind: Rise of the Antichrist",
                "After millions of people vanish and the world falls into chaos," +
                        "a charismatic leader rises to lead the UN. However, his intentions are more sinister than they appear",
                "14",
                "Adventure",
                "1h 45m",
                false
            ),
            Movies(
                "John Wick: Chapter 4",
                "With the price on his head ever increasing, legendary hit man" +
                        "John Wick takes his fight against the High Table global as he" +
                        "seeks out the most powerful players in the underworld, from New York to Paris to Japan to Berlin.",
                "16",
                "Action/Neo-noir",
                "2h 49m",
                false
            ),
            Movies(
                "Suzume",
                "As the skies turn red and the planet trembles, Japan stands on the brink of disaster." +
                        "However, a determined teenager named Suzume sets out on a mission to save her country." +
                        "Able to see supernatural forces that others cannot, it's up to her to close the mysterious doors.",
                "12",
                "Adventure/Animation",
                "2h 2m",
                true
            ),
            Movies(
                "Transformers - The Movie",
                "Quantum Realm, interacting with strange new creatures and embarking on an" +
                        "adventure that pushes them beyond the limits of what they thought was possible.",
                "12",
                "Adventure/Action",
                "2h 5m",
                false
            ),
        )
    }
}