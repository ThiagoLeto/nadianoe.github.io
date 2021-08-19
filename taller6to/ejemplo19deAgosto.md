#### Ejemplo

```python

import pandas as pd
import numpy as np


# Representación de NaN: np.nan

# Asignación
valor = np.nan

df = pd.DataFrame({' Weight ':[23, 88, 56, 15, 71],
                   'Nam e':['Sam', 'Andrea', 'Alex', "nan", 'Kia'],
                   ' Ag e':[14, 25, 55, 8, 21]})

# Para eliminar los espacios en las columnas

columnas = list(df.columns)

for i in range(len(columnas)):
    columnas[i] = columnas[i].replace(" ","")

df.columns = columnas

```
## Otra forma de eliminar el espacio inicial:
```python
df1 = pd.read_csv("../data/datos.csv",sep=",", skipinitialspace=True,engine="python" )
```
