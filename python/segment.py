import math
t=[]
w=[]
    
def  const(a,l,h,k):
    if(l==h):
        t[k]=a[l]
        return
    mid =int((l+h)//2)
    const(a,l,mid,int(2*k)+1)
    const(a,mid+1,h,int(2*k)+2)
    t[k]=t[int(k*2)+1]+t[int(k*2)+2]
    return

def  constSort(a,l,h,k):
    if(l==h):
        w[k]=a[l]
        return
    mid =int((l+h)//2)
    constSort(a,l,mid,int(2*k)+1)
    constSort(a,mid+1,h,int(2*k)+2)
    w[k]=w[int(k*2)+1]+w[int(k*2)+2]
    return

def call(a,l,h,ql,qh,p):
    if(ql<=l and qh>=h):
        return a[p]
    elif(ql>h or l>qh):
        return 0
    mid= (l+h)//2;
    return call(a,l,mid,ql,qh,int(2*p)+1)+call(a,mid+1,h,ql,qh,int(2*p)+2)
    
n=[0]*int(input())
a = list(map(int, input().split()))
s=a.copy();
s=sorted(s);
r=math.ceil(math.log(len(n))/math.log(2))
r=math.pow(2,r)
t=[0]*(int(r*2)-1)
w=[0]*(int(r*2)-1)
const(a,0,len(n)-1,0)
constSort(s,0,len(n)-1,0)
q=int(input())

for i in range(q):
    b = list(map(int, input().split()))
    if(b[0]==1):
        print(call(t,0,len(n)-1,b[1]-1,b[2]-1,0))
    else:
        print(call(w,0,len(n)-1,b[1]-1,b[2]-1,0))
  