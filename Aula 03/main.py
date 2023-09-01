import xml.etree.ElementTree as ET

import os

# gerenciando diretorio

diretorio_atual = os.getcwd()
os.chdir(diretorio_atual)

tree = ET.parse("passageiros.xml")
root = tree.getroot()


def listar_passageiros():

    for passageiro in root.findall("passageiro"):
        nome = passageiro.find("nome").text
        print(f"Nome passageiro {nome}")
        numero = passageiro.find("numeroT").text
        print(f"Número do passageiro: {numero}")
        partida = passageiro.find("origem").text
        print(f"Origem: {partida}")
        destino = passageiro.find("destino").text
        print(f"Destino: {destino}")
        print()


listar_passageiros()
