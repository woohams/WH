# -*- coding:utf-8 -*-

from bs4 import BeautifulSoup
import urllib.request
import json
from urllib.parse import quote

a = input()

str_euckr = quote(a.encode('euc-kr'))
print(str_euckr)
resp = urllib.request.urlopen("http://www.noranbook.net/search/search_list.asp?title=%s" % str_euckr)
soup = BeautifulSoup(resp, 'html.parser')

booklist = soup.find('td', {'class':'black_small'})
div = booklist.select('a')
print(div)
res = {}
lst = list()
num = 0
cnt = 0
tmp = {}
for chd in div:
    print(chd.text)
    if cnt % 3 == 0 :
        num = num + 1  
        tmp['number'] = num  
        tmp['title'] = chd.text
    elif cnt % 3 == 1 :
        tmp['value'] = chd.text
    else :
        lst.append(tmp)
        tmp = {}
    cnt = cnt + 1
       
res['booklist'] = lst
res_json = json.dumps(res, ensure_ascii=False)
    
with open("noranbook.json", "w", encoding='utf-8')as f:
    f.write(res_json)





