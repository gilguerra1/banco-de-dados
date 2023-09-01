import requests

url = "https://olinda.bcb.gov.br/olinda/servico/Pix_DadosAbertos/versao/v1/odata/ChavesPix(Data=@Data)?@Data='2022-05-19'&$top=100&$format=json"

response = requests.get(url)
print(response)
json_selic = response.json()

print(json_selic)

for item in json_selic["value"]:
    print("Data:", item['Data'])
    print("ISPB:", item['ISPB'])
    print("Nome:", item['Nome'])
    print("Natureza Usuario:", item['NaturezaUsuario'])
    print("Tipo de chave:", item['TipoChave'])
    print("Quantidade de chaves:", item['qtdChaves'])
    print() 

''' 
link da api : https://dadosabertos.bcb.gov.br/dataset/pix
link da documentação: https://olinda.bcb.gov.br/olinda/servico/Pix_DadosAbertos/versao/v1/documentacao

'''