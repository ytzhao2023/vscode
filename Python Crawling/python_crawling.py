"""
http协议，服务器和客户端进行数据交互的数据类型
常用请求头信息
-user-agent， 请求载体的身份标识
-connection， 请求完毕后，是断开还是保持连接
常用响应头信息
content-type：服务器响应回客户端的数据类型

https协议，安全的超文本传输协议
加密方式
-对称密钥加密
-非对称密钥加密
-证书密钥加密

"""

# requests can imitate the explore to pull a request. 
# crawling the data of bilibili's homepage

import requests
if __name__ == "__main__":
    # step1: pointed the url as string
    url = "https://www.bilibili.com/?spm_id_from=333.1007.0.0"
    # step2: pull a request
    response = requests.get(url = url)
    # step3: gain the data, and return
    page_text = response.text
    print(page_text)
    # step4: continuing storing the data
    with open("./bilibili.html", "w", encoding = "utf-8") as fp:
        fp.write(page_text)


