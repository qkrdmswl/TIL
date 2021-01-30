# 내 풀이>
import collections
import re
from operator import itemgetter


class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        p = paragraph.lower()
        p = re.sub('[-=+,#/\?:^$.@*\"※~&%ㆍ!』\\‘|\(\)\[\]\<\>`\'…》]', '', p)
        plist = list(p.split())
        pcounter = collections.Counter(plist)
        sortedP = sorted(pcounter.items(), key=itemgetter(1), reverse=True)

        for x in sortedP:
            if x[0] not in banned:
                answer = x[0]
                break
            else:
                continue

        return answer

    mostCommonWord("a, a, a, a, b,b,b,c, c", ["a"])
# Error: input = "a, a, a, a, b,b,b,c, c" / ["a"]
#        output = "bbbc"
#        expected = "b"


# 2)
# import re
# from collections import Counter

# words = [word for word in re.sub('[^\w]',' ',str).lower().split() if word not in ban]
# counts = Counter(words)
# 가장 흔하게 등장하는 단어의 첫번째 인덱스 리턴
# return counts.most_common(1)[0][0]


# * re 모듈의 sub()
# * => sub(패턴, 교체할 문자열, 최대 교체수, 플래그)
