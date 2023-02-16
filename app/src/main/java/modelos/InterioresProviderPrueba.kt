package modelos

class InterioresProviderPrueba {
    companion object{
        val interioresList = listOf<Interiores>(

            Interiores(
                "Asientos",
                "data:image/jpeg;base64,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",
                "asientos"
            ),
            Interiores(
                "Alfombra",
                "https://img.automexico.com/2019/02/14/b09YwtPD/alfombra-para-autos-95e0.jpg",
                "alfombra"
            )
        )
    }
}