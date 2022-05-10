class Solution(object):
    def largestGoodInteger(self, num):
        """
        :type num: str
        :rtype: str
        """
        goodstring = []
        if (len(num) < 3 or len(num) > 1000):
            return ""
        for i in range(len(num)):
            if (i+2 < len(num)):
                if (num[i] == num[i+1] == num[i+2]):
                    goodstring.append(num[i]+num[i+1]+num[i+2])
                    i= i+2
        if goodstring:
            return max(goodstring)
        else:
            return ""