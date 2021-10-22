Solution1:
class Solution:
    def getValidT9Words(self, num: str, words):
        mp={2:['a','b','c'],
            3:['d','e','f'],
            4:['g','h','i'],
            5:['j','k','l'],
            6:['m','n','o'],
            7:['p','q','r','s'],
            8:['t','u','v'],
            9:['w','x','y','z']
        }
        res=[]
        for word in words:
            flag=True
            for i,x in enumerate(word):
                if x not in mp[int(num[i])]:
                    flag=False
                    break
            if flag:
                res.append(word)
        return res

Solution2:
class Solution:
    def getValidT9Words(self, num: str, words):
        l=['2', '2', '2', '3', '3', '3', '4', '4', '4', '5', '5', '5', '6', '6', '6', '7', '7', '7', '7', '8', '8', '8', '9', '9', '9', '9']
        res=[]
        for word in words:
            flag=True
            for i,x in enumerate(word):
                if l[ord(x)-ord('a')]!=num[i]:
                    flag=False
                    break 
            if flag:
                res.append(word)
        return res