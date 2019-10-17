# -*- coding:utf-8 -*-

from bs4 import BeautifulSoup
from selenium import webdriver

url = 'http://www.noranbook.net/search/search_list.asp?title='+input('검색어:')

options = webdriver.ChromeOptions()
options.add_argument('headless')
options.add_argument('disable-gpu')

# options = 크롬안뜨게 해달라는 것 
driver = webdriver.Chrome('c:/test/chromedriver.exe',options=options)
# chrome버전 확인 후 chormedriver를 다운로드 -> 경로 설정
driver.implicitly_wait(3)
driver.get(url)

soup = BeautifulSoup(driver.page_source,'html.parser')

print(soup.find('a',{'class','black_11'}))