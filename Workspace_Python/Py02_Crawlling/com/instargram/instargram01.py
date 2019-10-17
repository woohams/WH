# -*- coding:utf-8 -*-

# 설치
# pip install beautifulsoup4
# pip install requests

from bs4 import BeautifulSoup
import requests

tag = input('search tag : ')
url = "https://www.instagram.com/explore/tags/"+tag
resp = requests.get(url)
soup = BeautifulSoup(resp.text, 'html.parser')

#print(soup)

# javascript로 가져오게 해놔서 못가져왔음

print(soup.find('div',{'class','KL4Bh'}))