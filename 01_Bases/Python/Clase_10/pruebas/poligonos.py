from math import tan, pi


class PoligonoRegular:
    def __init__(self, lado: float, n_lados: int) -> None:
        if lado <= 0:
            raise ValueError("El lado debe ser positivo")
        if n_lados < 3:
            raise ValueError("Un polígono debe tener al menos 3 lados")
        self._lado = lado
        self._n_lados = n_lados

    def perimetro(self) -> float:
        return self._n_lados * self._lado

    def apotema(self) -> float:
        return self._lado / (2 * tan(pi / self._n_lados))

    def area(self) -> float:
        return (self.perimetro() * self.apotema()) / 2


class Cuadrado(PoligonoRegular):
    def __init__(self, lado: float) -> None:
        super().__init__(lado, 4)


class Triangulo(PoligonoRegular):
    def __init__(self, lado: float) -> None:
        super().__init__(lado, 3)


class Circulo:
    def __init__(self, radio: float) -> None:
        pass
