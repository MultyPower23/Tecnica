class Vehiculos:

    def __init__(self, marca: str, modelo: str):
        self.__marca = marca
        self.__modelo = modelo
        self.__enMarcha = False
        self.__acelera = True
        self.__frenos = True

    def arrancar(self):
        self.__enMarcha = True

    def acelerar(self):
        self.__acelera = True

    def frenar(self):
        self.__frenos = True

    def estado(self):
        print(
            f"Marca: {self.__marca}        \
            \nModelo: {self.__modelo}      \
            \nEn marcha: {self.__enMarcha} \
            \nAcelerando: {self.__acelera} \
            \nFrenando: {self.__frenos}"
        )


class Moto(
    Vehiculos
):  # esto se llama herencia, la clase hija (en este caso la moto) hereda todos los atributos y metodos de la clase padre (los vehiculos)
    hcaballitos = ""
    ruedas = 3

    def caballito(self):
        self.hcaballitos = "Voy haciendo caballito"

    def estado(self):
        print("=== ESTADO DE LA MOTO ===")
        super().estado()
        print(
            f"Ruedas: {self.ruedas} \
              \n{self.hcaballitos}"
        )


miCoche = Vehiculos("Chevrolet", "2027")

miMoto = Moto("Victory", "2021")

miMoto.estado()
