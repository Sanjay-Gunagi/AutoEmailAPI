Set outlook = CreateObject("Outlook.Application")
Set email = outlook.createItem(0)
'subject = WScript.Arguments.Item(0)


'body1 = WScript.Arguments.Item(1)
'body2 = WScript.Arguments.Item(2)
'body3 = WScript.Arguments.Item(3)

'body = body1 & " " &body2 &" "& " "& body3

subject = "Automated Email From F&R System | " & Date '& " " & time
body = "Hi, "& vbCrLf & vbCrLf &"This is automated mail from Flights and Routing (F&R) System." & vbCrLf & vbCrLf & "Thanks," & vbCrLf & "Team F&R"
'email1 = WScript.Arguments.Item(2)
'email2 = WScript.Arguments.Item(3)

With email
	.to = "sanjay.gunagi@unisys.com"
	'.Recipients.Add ("sanjay.s.gunagi@gmail.com")
	.Subject = subject
	.Body = body
	'.Attachments.Add ""
	'.HTMLBody = "" &_ "<div align = "left"> Check out </div?" 
	.Send
End With
wscript.quit()
