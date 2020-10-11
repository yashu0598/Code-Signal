def classifyStrings(s):
    if re.findall('(([aeiou]{3})|[^aeiou?]{5})',s):
        return 'bad'
    if '?' in s:
        a = classifyStrings(s.replace('?','a',1))
        b = classifyStrings(s.replace('?','n',1))
        return a if a == b else 'mixed'
    return 'good'
