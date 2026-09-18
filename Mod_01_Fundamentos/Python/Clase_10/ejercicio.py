class Padre:
    def __init__(self, color_ojos: str, forma_cara: str, altura: float) -> None:
        self._color_ojos: str = color_ojos
        self._forma_cara: str = forma_cara
        if altura > 0:
            self._altura: float = altura
        else:
            self._altura: float = 1.6

    def rasgos(self) -> str:
        return f"""Tiene los siguientes rasgos:
Ojos de color: {self._color_ojos}
Forma de la cara: {self._forma_cara}
Altura: {self._altura} metros"""


class Hija(Padre):
    def __init__(
        self, color_ojos: str, forma_cara: str, altura: float, talento: str = ""
    ) -> None:
        # logre hacer casi todo sin el contructor menos el nuevo atributo de talento,y no me gustaba la idea
        # de definirlo por aparte con hija1.self._talento = "Tocar piano", entonces decidi si usar el contructor
        # para asignar el talento al momento de crear la instancia

        super().__init__(color_ojos, forma_cara, altura)
        self._talento = talento

    def rasgos(self) -> str:
        if self._talento == "":
            return super().rasgos() + f"""\nTalento: No tiene"""
        return super().rasgos() + f"""\nTalento: {self._talento}"""


hija1 = Hija("Azules", "Ovalada", 1.70, "Tocar piano")
hija2 = Hija("Cafes", "Cuadrada", 1.40, "Dibujar")
hija3 = Hija("Verdes", "Triangular", -15)

print(hija1.rasgos())
print("-" * 40)
print(hija2.rasgos())
print("-" * 40)
print(hija3.rasgos())
